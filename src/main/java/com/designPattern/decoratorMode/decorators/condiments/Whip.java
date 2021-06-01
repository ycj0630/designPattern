/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.decorators.condiments;

import com.designPattern.decoratorMode.Beverage;
import com.designPattern.decoratorMode.decorators.CondimentDecorator;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Whip.java, v 0.1 2021年05月19日 17:26 wb-ycj545508 Exp $
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        if(beverage instanceof CondimentDecorator){
            return  ((CondimentDecorator) beverage).getDesc()+"奶泡";
        }
        return "奶泡";
    }

    @Override
    public int cost() {
        return beverage.cost()+ 5 ;
    }
}