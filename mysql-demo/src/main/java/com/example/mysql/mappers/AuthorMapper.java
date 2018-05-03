package com.example.mysql.mappers;

import com.example.mysql.domains.Author;
import com.example.mysql.models.AuthorBaseDTO;
import com.example.mysql.models.AuthorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorBaseDTO authorToAuthorBaseDTO(Author author);

    AuthorDTO authorToAuthorDTO(Author author);

    Author authorDtoToAuthor(AuthorBaseDTO authorDTO);
}
