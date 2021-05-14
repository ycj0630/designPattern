/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyModel.duckDemo.DuckType;

import com.designPattern.strategyModel.duckDemo.Duck;
import com.designPattern.strategyModel.duckDemo.behavior.impl.FlyWithWing;
import com.designPattern.strategyModel.duckDemo.behavior.impl.Quack;

/**
 *  绿头鸭
 * @author wb-ycj545508
 * @version $Id: GreenDuck.java, v 0.1 2021年05月14日 15:19 wb-ycj545508 Exp $
 */
public class GreenDuck extends Duck {



    public GreenDuck(){
        flyBehavior = new FlyWithWing();
        quackBehavior = new Quack();
    }








    @Override
    public void display() {
        System.out.println("我是绿头鸭子");
    }
}