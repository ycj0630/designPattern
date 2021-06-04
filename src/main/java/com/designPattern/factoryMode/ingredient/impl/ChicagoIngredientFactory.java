/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryMode.ingredient.impl;

import com.designPattern.factoryMode.PizzaIngredientFactory;
import com.designPattern.factoryMode.ingredient.*;

/**
 *
 * @author wb-ycj545508
 * @version $Id: ChicagoIngredientFactory.java, v 0.1 2021年06月01日 15:42 wb-ycj545508 Exp $
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SllcadPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggie[] crearteVeggies() {
        Veggie[] veggies = { new BlackOlives(), new EggPlant(), new Mozzarella(), new Spinach() };
        return veggies;
    }
}