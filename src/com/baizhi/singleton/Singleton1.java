package com.baizhi.singleton;
//懒汉式单例模式  线程安全的  双重加锁机制
public class Singleton1 {

    private static  Singleton1 single = null;
    private Singleton1(){}
    private static Singleton1 newInstance(){
        if (single == null){
            synchronized(Singleton1.class){
                if(single == null){
                    single = new Singleton1();
                }
            }
        }
        return single;
    }
}
