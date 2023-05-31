package com.jiayu.design.factory.abstractfactory;

/**
 * @ClassName : FactoryBMW320
 * @Description :
 * @Author : jiayu
 * @Date: 2023-05-31 14:58
 */


//宝马523系列
public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
