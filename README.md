# Design Pattern



## 创建型模式

### **单例模式**

> 单例模式保证了系统内存中只会 存在一个对象，节省了系统资源，对于一些需求频繁创建和销毁的对象，使用单例模式可以提高系统的性能。
>
> **使用场景**：需要频繁的创建和销毁对象，创建对象耗时过长或者耗费资源过多（指重量级的对象），但又经常用到的对象，工具类对象，频繁访问数据库或文件的对象（比如数据源、session工厂等）
>
> 源码参考：java.lang.Runtime 就是经典的饿汉式（静态变量）的单例模式

1.  **饿汉式（静态常量）**

   > 步骤如下
   >
   > 1. 构造器私有化（防止通过new创建出新的对象）
   > 2. 类的内部创建
   > 3. 向外暴露一个公共的方法，e.g    getInstance 

   

   ```java
   public class SingletonPattern01 {
       private final static SingletonPattern01 singleInstance = new SingletonPattern01();
   
       //构造器私有化，外部不能new对象
       private SingletonPattern01() {
       }
   
       public static SingletonPattern01 getInstance(){
           return singleInstance;
       }
   }
   ```

   

2. **饿汉式（静态代码块）**

   > 步骤和‘静态常量’的一样
   >
   > 区别在于要创建一个静态块用于实例化对象

   

   ```java
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
   
   }
   ```

   

3. 懒汉式（线程不安全）

   > 步骤区别在于创建是在getInstance 里面创建的，按需创建

   

   ```java
   public class SingletonPattern03 {
       private static SingletonPattern03 instance;
   
       //构造器私有化，外部不能new对象
       private SingletonPattern03() {
       }
   
       //当去调用getInstance的时候才进行实例化
       public static SingletonPattern03 getInstance(){
           if (instance == null){
               instance = new SingletonPattern03();
           }
           return instance;
       }
   }
   ```

   

4. 懒汉式（线程安全，同步方法）

   > 在获取实例的方法上加同步。

   

   ```java
   public class SingletonPattern04 {
       private static SingletonPattern04 instance;
   
       //构造器私有化，外部不能new对象
       private SingletonPattern04() {
       }
   
       //当去调用getInstance的时候才进行实例化
       public static synchronized SingletonPattern04 getInstance(){
           if (instance == null){
               instance = new SingletonPattern04();
           }
           return instance;
       }
   }
   ```

   

5. 懒汉式（线程安全，同步代码块）

   > 在需要创建实例的代码上使用同步

   

   ```java
   public class SingletonPattern05 {
       private static SingletonPattern05 instance;
   
       //构造器私有化，外部不能new对象
       private SingletonPattern05() {
       }
   
       //当去调用getInstance的时候才进行实例化
       public static  SingletonPattern05 getInstance(){
           if (instance == null){
               synchronized(SingletonPattern05.class){
                   instance = new SingletonPattern05();
               }
           }
           return instance;
       }
   }
   ```

   

6. **双重检查**

> 将变量用volatile修饰，确保可见性
>
> 在同步代码块中增加一个静态变量的判断。

```java
public class SingletonPattern06 {
    //volatile保证了多线程情况下的静态变量可见性。
    private static volatile SingletonPattern06 instance;

    //构造器私有化，外部不能new对象
    private SingletonPattern06() {
    }

    //当去调用getInstance的时候才进行实例化
    public static SingletonPattern06 getInstance(){
        if (instance == null){
            synchronized(SingletonPattern06.class){
                if (instance == null){
                    instance = new SingletonPattern06();
                }
            }
        }
        return instance;
    }
}
```

7. **静态内部类**

   > 创建实例在静态内部类中创建
   >
   > 静态内部类的特点：
   >
   > - 不会随着它的外层类去加载而被加载，而是在调用静态内部类方法的时候去加载内部类
   > - 采用了类加载机制保证了创建实例的时候只有一个线程

   

   ```java
   public class SingletonPattern07 {
   
       //构造器私有化，外部不能new对象
       private SingletonPattern07() {
       }
   
       private static class SingletonInstance{
           private static final SingletonPattern07 INSTANCE =new SingletonPattern07();
       }
   
       //当去调用getInstance的时候才进行实例化
       public static SingletonPattern07 getInstance(){
           return SingletonInstance.INSTANCE;
       }
   }
   ```

   

8. **枚举**

   > 在枚举里创建的实例都是单例的。
   >
   > 不仅能避免线程同步的问题，还能通过这种方式防止反序列化创建新的对象，所以推荐使用

   

   ```java
   public enum SingletonPattern08 {
       INSTANCE;
       public void say(){
           System.out.println("ok!");
       }
   }
   ```

   


### 简单工厂模式（静态工厂模式）

![1573316931594](assets/1573316931594.png)

> 相关代码见包 com.lga.pattern.factory 下的代码

### 工厂方法模式



![1573352407361](assets/1573352407361.png)

> 定义一个创建对象的抽象方法，由子类去决定需要实例化的类。工厂方法模式将对象的实例化推迟到了子类



原型模式

建造者模式

**工厂模式**

## 结构型模式

适配器模式

桥接模式

**装饰模式**

组合模式

外观模式

享元模式

**代理模式**

## 行为型模式

模板方法模式

命令模式

访问者模式

迭代器模式

**观察者模式**

中介者模式

备忘录模式

解释器模式（Interpreter模式）

状态模式

策略模式

职责链模式（责任链模式）