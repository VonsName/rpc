package com.von.demotransaction;

import java.io.*;

/**
 * @author ： fjl
 * @date ： 2019/5/24/024 14:10
 */
public class SerializeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("person.txt"));

        PersonSerialize serialize = new PersonSerialize();
        serialize.setId("1");
        serialize.setName("李四");
        oos.writeObject(serialize);

        //同一个对象序列化只会写一次 后面更改的值不会序列化到文件
        serialize.setName("王五");
        serialize.setId("2");
        oos.writeObject(serialize);

        PersonSerialize p1 = (PersonSerialize) ios.readObject();
        PersonSerialize p2 = (PersonSerialize) ios.readObject();

        System.out.println(p1 == p2);

        //更改了值后重新写一次 但是实际上被没有重新序列化第二次修改的值到文件
        //PersonSerialize{name='李四', id='1'}
        //PersonSerialize{name='李四', id='1'}
        System.out.println(p1);
        System.out.println(p2);
    }
}