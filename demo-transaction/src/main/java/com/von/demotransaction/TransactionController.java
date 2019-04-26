package com.von.demotransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ： fjl
 * @date ： 2019/4/26/026 10:21
 */
@RestController
@RequestMapping(value = "/trans")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "addBook")
    public Book addBook() {
        return transactionService.addBook();
    }
}
