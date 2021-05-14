/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyModel.duckDemo.behavior.impl;

import com.designPattern.strategyModel.duckDemo.behavior.QuackBehavior;

/**
 *
 * @author wb-ycj545508
 * @version $Id: MuteQuack.java, v 0.1 2021年05月14日 15:27 wb-ycj545508 Exp $
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}