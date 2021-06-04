/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.adapterModeAndAppearanceMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: DuckAdaptor.java, v 0.1 2021年06月04日 17:00 wb-ycj545508 Exp $
 */
public class DuckAdaptor implements Turck {

    private Duck duck;

    public DuckAdaptor(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}