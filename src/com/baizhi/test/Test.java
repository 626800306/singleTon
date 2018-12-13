package com.baizhi.test;

import com.baizhi.singleton.Emplorer;

/**
 * @author zzu
 * @date 2018/12/13 - 20:24
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emplorer emplorer = Emplorer.newInstance();
            emplorer.say();
        }
    }
}
