package com.jiayu.design.singleton;

/**
 * @Author tianjiayu
 * @Description  枚举类解决单例模式
 * @Date 11:39 2023/5/31
 * @Param
 * @return
 **/
public  enum SingletonEnum {
    INSTANCE;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.setName("田家宇");
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance1==instance2);
    }
}


