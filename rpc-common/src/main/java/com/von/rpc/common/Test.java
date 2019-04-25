package com.von.rpc.common;

import com.google.protobuf.InvalidProtocolBufferException;
import com.von.rpc.common.entity.ComplexResult;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 11:27
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException, InvalidProtocolBufferException, NoSuchMethodException {

        ComplexResult.Exception exception = ComplexResult.Exception.newBuilder().
                setExClazz("com")
                .setExMessage("异常信息").build();

        ComplexResult.Result result = ComplexResult.Result.newBuilder()
                .setData("测试数据1111")
                .setRequestId(UUID.randomUUID().toString())
                .setResponseId(UUID.randomUUID().toString().replace("-", "")).build();


        ComplexResult.Result result2 = ComplexResult.Result.newBuilder()
                .setData("测试数据2222")
                .setRequestId(UUID.randomUUID().toString())
                .setResponseId(UUID.randomUUID().toString().replace("-", "")).build();



        ComplexResult.Result.Builder builder = ComplexResult.Result.newBuilder()
                .setData("测试数据")
                .setRequestId(UUID.randomUUID().toString())
                .setResponseId(UUID.randomUUID().toString().replace("-", ""));


        //setResult 注意这里因为 protobuf默认创建的是一个空的集合 Collections.emptyList()
        //使用setResult(int index,...)会导致IndexOutOfBoundsException
        //所以只能使用add的方式添加数据
        ComplexResult.ComplexTest res = ComplexResult.ComplexTest.newBuilder()
                .setException(exception)
                .addResult(result)
                .addResult(result2)
                .build();

        byte[] bytes = res.toByteArray();
        ComplexResult.ComplexTest parseFrom = ComplexResult.ComplexTest.parseFrom(bytes);


        System.out.println(parseFrom.getException().getExMessage());
        parseFrom.getResultList().forEach(s -> System.out.println(s.getData()));
    }
}
