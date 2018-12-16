package com.baizhi.singleton;

/**
 * @author zzu
 * @date 2018/12/13 - 20:35
 */
public class Singleton {
    //它是饿汉式单例模式

    //自己私有化对象
    private static final Singleton SINGLETON = new Singleton();
    //构造方法私有目的不能通过new的方式创建对象
    private Singleton(){}
    //只能通过此方法创建Singleton对象
    public static Singleton newSingleton(){
        return SINGLETON;
    }
    //类中其他的方法
    public static void doSomething(){

    }
}
