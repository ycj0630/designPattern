/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryModel.impl;

import com.designPattern.factoryModel.Pizza.Pizza;
import com.designPattern.factoryModel.Pizza.impl.CheesePizza;
import com.designPattern.factoryModel.PizzaIngredientFactory;
import com.designPattern.factoryModel.PizzaStory;
import com.designPattern.factoryModel.ingredient.impl.ChicagoIngredientFactory;

/**
 *
 * @author wb-ycj545508
 * @version $Id: ChicagoPizzaStory.java, v 0.1 2021年06月01日 16:03 wb-ycj545508 Exp $
 */
public class ChicagoPizzaStory extends PizzaStory {

    private Pizza pizza;

    @Override
    protected Pizza create(String type) {

        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("cheesePizza");
        }else if("veggie".equals(type)){
        }else if("clam".equals(type)){

        }else if("pepperoni".equals(type)){

        }

        return pizza;
    }
}