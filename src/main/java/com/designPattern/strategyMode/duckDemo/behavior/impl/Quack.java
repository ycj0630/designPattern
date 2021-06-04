/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo.behavior.impl;

import com.designPattern.strategyMode.duckDemo.behavior.QuackBehavior;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Quack.java, v 0.1 2021年05月14日 15:25 wb-ycj545508 Exp $
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }
}