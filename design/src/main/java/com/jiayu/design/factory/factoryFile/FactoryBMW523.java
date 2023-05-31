package com.jiayu.design.factory.factoryFile;

/**
 * @ClassName : FactoryBMW320
 * @Description :
 * @Author : jiayu
 * @Date: 2023-05-31 14:32
 */

public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
