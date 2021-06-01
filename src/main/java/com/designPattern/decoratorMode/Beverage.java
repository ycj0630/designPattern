/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Beverage.java, v 0.1 2021年05月19日 17:06 wb-ycj545508 Exp $
 */
public abstract class Beverage {

    public String desc = "unknow beverage";

    public abstract int cost();

    public String getDesc(){
        return desc;
    }

}