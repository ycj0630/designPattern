/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryMode;

import com.designPattern.factoryMode.ingredient.*;

/**
 *
 * @author wb-ycj545508
 * @version $Id: PizzaIngredientFactory.java, v 0.1 2021年05月31日 20:21 wb-ycj545508 Exp $
 */
public interface PizzaIngredientFactory {


    public Cheese createCheese();

    public Clams createClams();

    public Dough createDough();

    public Pepperoni createPepperoni();

    public Sauce createSauce();

    public Veggie[] crearteVeggies();


}