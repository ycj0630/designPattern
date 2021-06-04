/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo.behavior.impl;

import com.designPattern.strategyMode.duckDemo.behavior.FlyBehavior;

/**
 *
 * @author wb-ycj545508
 * @version $Id: FlyWithWing.java, v 0.1 2021年05月14日 15:23 wb-ycj545508 Exp $
 */
public class FlyWithWing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我在风中飞翔");

    }
}