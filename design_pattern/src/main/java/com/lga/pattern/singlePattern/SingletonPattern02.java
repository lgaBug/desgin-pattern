package com.lga.pattern.singlePattern;


/**
 *describe: 饿汉式（静态代码块） 应用实例
 * summary:和SinglePattern01 一样都是在类加载的时候进行实例化，会创建出一个唯一的实例。但是可能会造成内存的浪费
 *
 *@author lga 
 *@date  2019/11/9 0009 14:05
 */ 

public class SingletonPattern02 {
    private static SingletonPattern02 singleInstance;

    //静态代码块，创建单个对象
    static{
        singleInstance = new SingletonPattern02();
    }

    //构造器私有化，外部不能new对象
    private SingletonPattern02() {
    }

    public static SingletonPattern02 getInstance(){
        return singleInstance;
    }

    public static void main(String[] args){

        SingletonPattern02 instance01 = SingletonPattern02.getInstance();
        SingletonPattern02 instance02 = SingletonPattern02.getInstance();

        System.out.println("instance01 == instance02 = " + (instance01 == instance02));

    }



}
