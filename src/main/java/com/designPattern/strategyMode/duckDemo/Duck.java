/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo;

import com.designPattern.strategyMode.duckDemo.behavior.FlyBehavior;
import com.designPattern.strategyMode.duckDemo.behavior.QuackBehavior;

/**
 * 所有种类鸭子的超类
 * @author wb-ycj545508
 * @version $Id: Duck.java, v 0.1 2021年05月14日 15:14 wb-ycj545508 Exp $
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //鸭子外观
    public abstract void display();

}