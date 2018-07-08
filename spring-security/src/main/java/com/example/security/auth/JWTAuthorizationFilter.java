package com.example.security.auth;

import com.example.security.domains.Role;
import com.example.security.repositories.UserRepository;
import com.example.security.services.UserService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.example.security.auth.SecurityConstants.HEADER_STRING;
import static com.example.security.auth.SecurityConstants.SECRET;
import static com.example.security.auth.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    private UserDetailsService userDetailsService;
    private UserRepository userRepository;

    public JWTAuthorizationFilter(AuthenticationManager authManager, UserDetailsService userDetailsService, UserRepository userRepository) {
        super(authManager);
        this.userDetailsService = userDetailsService;
        this.userRepository = userRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest req,
                                    HttpServletResponse res,
                                    FilterChain chain) throws IOException, ServletException {
        String header = req.getHeader(HEADER_STRING);
        if (header == null || !header.startsWith(TOKEN_PREFIX)) {
            chain.doFilter(req, res);
            return;
        }
        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req, res);
    }
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody()
                    .getSubject();
            Collection<Role> roles = userRepository.findUserByUsername(user).getRoles();
            UserDetails userDetails = userDetailsService.loadUserByUsername(user);
            if (user != null) {
                return new UsernamePasswordAuthenticationToken(userDetails, null, getAdminAuthority(roles));
            }
            return null;
        }
        return null;
    }


    private List<GrantedAuthority> getAdminAuthority() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }

    private  List<GrantedAuthority> getAdminAuthority(Collection<Role> userRoles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : userRoles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.name));
        }
        return authorities;
    }
}
