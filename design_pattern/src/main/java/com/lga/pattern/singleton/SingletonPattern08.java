package com.lga.pattern.singleton;


/**
 *describe: 枚举
 * summary:不仅能避免线程同步的问题，还能通过这种方式防止反序列化创建新的对象，所以推荐使用
 *@author lga
 *@date  2019/11/9 0009 13:53
 */ 
public enum SingletonPattern08 {
    INSTANCE;
    public void say(){
        System.out.println("ok!");
    }

}
