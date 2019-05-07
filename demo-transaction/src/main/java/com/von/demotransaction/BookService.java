package com.von.demotransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.UUID;

/**
 * @author ： fjl
 * @date ： 2019/4/26/026 11:08
 */
@Service
public class BookService {


    IMethodFilter methodFilter=(method -> AnnotatedElementUtils.hasAnnotation(method,InitBinder.class));

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Book addBook() {

        Book book = new Book();
        book.setId(UUID.randomUUID().toString().replace("-", ""));
        book.setName("三国演义");
        book.setPrice(1000L);

        String sql = "insert into book (id,name,price) values(?,?,?)";
        jdbcTemplate.update(sql, book.getId(), book.getName(), book.getPrice());

        return book;
    }

}
