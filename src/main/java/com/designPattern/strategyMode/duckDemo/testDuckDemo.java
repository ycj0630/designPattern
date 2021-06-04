/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.strategyMode.duckDemo;

import com.designPattern.strategyMode.duckDemo.DuckType.GreenDuck;

/**
 *  鸭子测试类
 * @author wb-ycj545508
 * @version $Id: testDuckDemo.java, v 0.1 2021年05月14日 15:28 wb-ycj545508 Exp $
 */
public class testDuckDemo {

    public static void main(String[] args) {
        // 三种鸭子
        //Duck duck1 = new GreenDuck();
        //duck1.display();
        //duck1.performFly();
        //duck1.performQuack();
        //
        //Duck duck2 = new ModelDuck();
        //duck2.display();
        //duck2.performFly();
        //duck2.performQuack();
        //
        //Duck duck3 = new XiangpiDuck();
        //duck3.display();
        //duck3.performFly();
        //duck3.performQuack();

        //鸭鸣器
        Duck duck1 = new GreenDuck();
        DuckChirpMachin duckChirpMachin = new DuckChirpMachin(duck1);
        duckChirpMachin.lure();
    }
}