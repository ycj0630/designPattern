/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.decorators;

import com.designPattern.decoratorMode.Beverage;

/**
 *
 * @author wb-ycj545508
 * @version $Id: CondimentDecorator.java, v 0.1 2021年05月19日 17:21 wb-ycj545508 Exp $
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDesc();
}