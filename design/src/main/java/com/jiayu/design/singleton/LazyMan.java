package com.jiayu.design.singleton;

/**
 * @ClassName : LazyMan
 * @Description : 懒汉式   内存紧缺可以用 但是要保证单例
 * @Author : jiayu
 * @Date: 2023-05-31 10:08
 */

public class LazyMan {
    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"");
    }

    public static LazyMan lazyMan;

    public static LazyMan getInstance(){
        synchronized (LazyMan.class) {
            if (lazyMan == null) {
                lazyMan = new LazyMan();
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->{
                getInstance();
            }).start();
        }
    }
}