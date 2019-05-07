package com.von.demotransaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ： fjl
 * @date ： 2019/5/6/006 15:41
 */
@RequestMapping
@RestController
public class SpringRoutingControllerTest {


    private int single=0;

    /**
     * Test SpringMvc单实例
     * 多次请求会共享 single 变量
     *
     * 多线程:若 "sleep" 阻塞当前请求
     *      发送 "on" 请求还是会顺利执行完成
     * @param name
     * @param data
     * @return
     */
    @GetMapping(value = "/hello")
    public String hello(String name,int data) {
        if ("on".equals(name)){
            single+=data;
            return "hello:" + name+"__"+single;
        }else if ("sleep".equals(name)){
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "hello:" + name+"__"+data;
    }
}
