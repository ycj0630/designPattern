/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.decorators.condiments;

import com.designPattern.decoratorMode.Beverage;
import com.designPattern.decoratorMode.decorators.CondimentDecorator;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Milk.java, v 0.1 2021年05月19日 17:22 wb-ycj545508 Exp $
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        if(beverage instanceof CondimentDecorator){
            return  ((CondimentDecorator) beverage).getDesc()+"牛奶";
        }
        return "牛奶";
    }

    @Override
    public int cost() {
        return beverage.cost() + 1;
    }
}