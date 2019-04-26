package com.von.demotransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author ： fjl
 * @date ： 2019/4/26/026 10:23
 */
@Service
public class TransactionService {


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private BookService bookService;

    @Transactional(rollbackFor = {RuntimeException.class}, propagation = Propagation.REQUIRED)
    public Book addBook() {

//        Book book = new Book();
//        book.setId(UUID.randomUUID().toString().replace("-", ""));
//        book.setName("三国演义");
//        book.setPrice(1000L);
//
//        String sql = "insert into book (id,name,price) values(?,?,?)";
//        jdbcTemplate.update(sql, book.getId(), book.getName(), book.getPrice());

        Book book = bookService.addBook();

        addUser(book);


        int a = 10;
        int b = 0;
        int c = a / b;

        return book;
    }

    @Transactional(rollbackFor = {RuntimeException.class}, propagation = Propagation.REQUIRES_NEW)
    public User addUser(Book book) {

        User user = new User();
        user.setBookId(book.getId());
        user.setUsername("张三");

        String sqls = "insert into user (b_id,username) values(?,?)";
        jdbcTemplate.update(sqls, user.getBookId(), user.getUsername());


        return null;
    }
}
