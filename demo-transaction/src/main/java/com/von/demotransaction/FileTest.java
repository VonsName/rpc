package com.von.demotransaction;

import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author ： fjl
 * @date ： 2019/5/15/015 11:26
 */
public class FileTest {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\360Downloads");
        readFile(file);
    }

    public static void readFile(File file) throws FileNotFoundException {
        if (!file.exists()) {
            return;
        }
        File[] files = file.listFiles();
        if (ObjectUtils.isEmpty(files)){
            System.out.println("直接当前的文件到xml");
            return;
        }
        for (File tmp : files) {
            if (tmp.isDirectory()){
                readFile(tmp);
            }else {
                System.out.println("父级名称:"+tmp.getParent());
                System.out.println("当前文件的名称"+tmp.getName());
            }
        }
    }
}
