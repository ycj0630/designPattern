/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.decorators.condiments;

import com.designPattern.decoratorMode.Beverage;
import com.designPattern.decoratorMode.decorators.CondimentDecorator;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Soy.java, v 0.1 2021年05月19日 17:25 wb-ycj545508 Exp $
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        if(beverage instanceof CondimentDecorator){
            return  ((CondimentDecorator) beverage).getDesc()+"豆浆";
        }
        return "豆浆";
    }
    @Override
    public int cost() {
        return beverage.cost()+ 3;
    }
}