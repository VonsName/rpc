package com.von.rpc.spring;

import com.von.rpc.common.annotation.MRpcService;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 9:37
 */
@MRpcService
public class BookServiceImpl implements BookService {
    @Override
    public Book queryBook(String id) {
        Book book = new Book();
        book.setNo(UUID.randomUUID().toString());
        book.setName("三国演义");
        book.setPrice(new BigDecimal("100.05"));
        return book;
    }
}
