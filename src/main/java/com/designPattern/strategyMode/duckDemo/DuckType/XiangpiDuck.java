/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo.DuckType;

import com.designPattern.strategyMode.duckDemo.Duck;
import com.designPattern.strategyMode.duckDemo.behavior.impl.FlyNoWay;
import com.designPattern.strategyMode.duckDemo.behavior.impl.Squeak;

/**
 *  橡皮鸭
 * @author wb-ycj545508
 * @version $Id: XiangpiDuck.java, v 0.1 2021年05月14日 15:36 wb-ycj545508 Exp $
 */
public class XiangpiDuck extends Duck {

    public XiangpiDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}