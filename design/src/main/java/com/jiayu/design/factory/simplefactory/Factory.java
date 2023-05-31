package com.jiayu.design.factory.simplefactory;

/**
 * @ClassName : Factory
 * @Description : 简单工厂类
 * @Author : jiayu
 * @Date: 2023-05-31 11:58
 */

public class Factory {
    public BMW createBMW(int type) {

        switch (type) {
            case (320):
                return new BMW320();
            case (523):
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
