package com.example.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.security.domains.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    public Boolean existsByName(String name);
    public Role findRoleByName(String name);
}
