package com.lga.pattern.prototype.utils;

import java.io.*;

public class ObjectUtils {

    public static Object deepClone(Object targetObj) throws IOException, ClassNotFoundException {
        Object object = null;
        //创建流对象，将tragetObj以流的形式输出
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(targetObj);
        //反序列化,将对象输入进来
        object = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject();
        return object;
    }
}
