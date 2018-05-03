package com.example.mysql.mappers;

import com.example.mysql.domains.Book;
import com.example.mysql.models.BookBaseDTO;
import com.example.mysql.models.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToBookDTO(Book book);

    BookBaseDTO bookToBookBaseDTO(Book book);

    Book bookDtoToBook(BookBaseDTO bookDTO);
}
