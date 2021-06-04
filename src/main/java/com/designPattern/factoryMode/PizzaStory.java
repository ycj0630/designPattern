/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryMode;

import com.designPattern.factoryMode.Pizza.Pizza;

/**
 *
 * @author wb-ycj545508
 * @version $Id: PizzaStory.java, v 0.1 2021年05月25日 18:51 wb-ycj545508 Exp $
 */
public abstract class PizzaStory {

    protected abstract Pizza create(String type);

    public Pizza order(String type){

        Pizza pizza = create(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();

        System.out.println(type + " Pizza 制作完成!");
        return pizza;

    }
}