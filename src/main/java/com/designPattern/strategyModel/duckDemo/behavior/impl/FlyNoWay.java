/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyModel.duckDemo.behavior.impl;

import com.designPattern.strategyModel.duckDemo.behavior.FlyBehavior;

/**
 *
 * @author wb-ycj545508
 * @version $Id: FlyNoWay.java, v 0.1 2021年05月14日 15:24 wb-ycj545508 Exp $
 */
public class FlyNoWay implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("我不能飞");
    }
}