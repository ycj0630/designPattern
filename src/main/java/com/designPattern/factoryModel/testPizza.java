/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryModel;

import com.designPattern.factoryModel.impl.ChicagoPizzaStory;

/**
 *
 * @author wb-ycj545508
 * @version $Id: testPizza.java, v 0.1 2021年06月01日 16:48 wb-ycj545508 Exp $
 */
public class testPizza {
    public static void main(String[] args) {
        PizzaStory pizzaStory = new ChicagoPizzaStory();
        pizzaStory.order("cheese");

    }

}