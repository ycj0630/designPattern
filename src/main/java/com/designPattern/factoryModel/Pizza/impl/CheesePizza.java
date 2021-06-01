/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryModel.Pizza.impl;

import com.designPattern.factoryModel.Pizza.Pizza;
import com.designPattern.factoryModel.PizzaIngredientFactory;

/**
 *
 * @author wb-ycj545508
 * @version $Id: CheesePizza.java, v 0.1 2021年06月01日 16:07 wb-ycj545508 Exp $
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
    }
}