package com.baizhi.singleton;

/**
 * @author zzu
 * @date 2018/12/13 - 20:22
 */
public class Emplorer {
    /*private static final Emplorer E = new Emplorer();
    private Emplorer(){ }
    public static Emplorer newInstance(){
        return E;
    }
    public void say(){
        System.out.println("你好!国王!");
    }*/
    private static final Emplorer E = new Emplorer();
    private Emplorer(){}
    public static Emplorer newEmplorer(){
        return E;
    }
}
