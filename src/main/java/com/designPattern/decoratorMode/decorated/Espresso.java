/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode.decorated;

import com.designPattern.decoratorMode.Beverage;
import com.designPattern.decoratorMode.CupSize;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Espresso.java, v 0.1 2021年05月19日 18:50 wb-ycj545508 Exp $
 */
public class Espresso extends Beverage implements CupSize {

    public Espresso() {
        desc="浓咖啡";
    }

    @Override
    public int cost() {
        return 30;
    }
}