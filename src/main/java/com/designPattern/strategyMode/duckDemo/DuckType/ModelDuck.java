/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo.DuckType;

import com.designPattern.strategyMode.duckDemo.Duck;
import com.designPattern.strategyMode.duckDemo.behavior.impl.FlyNoWay;
import com.designPattern.strategyMode.duckDemo.behavior.impl.MuteQuack;

/**
 *  模型鸭
 * @author wb-ycj545508
 * @version $Id: ModelDuck.java, v 0.1 2021年05月14日 15:34 wb-ycj545508 Exp $
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}