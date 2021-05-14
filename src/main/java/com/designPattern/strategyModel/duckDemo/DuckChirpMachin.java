/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyModel.duckDemo;

import com.designPattern.strategyModel.duckDemo.behavior.QuackBehavior;

/**
 *  设计鸭鸣器
 * @author wb-ycj545508
 * @version $Id: DuckChirpMachin.java, v 0.1 2021年05月14日 15:50 wb-ycj545508 Exp $
 */
public class DuckChirpMachin implements QuackBehavior{

    private QuackBehavior quackBehavior;

    public DuckChirpMachin(Duck duck){
        setQuackBehavior(duck.quackBehavior);
    }

    public void lure(){
        quack();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}