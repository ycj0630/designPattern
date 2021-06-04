/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.adapterModeAndAppearanceMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: GreenDuck.java, v 0.1 2021年06月04日 16:58 wb-ycj545508 Exp $
 */
public class GreenDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("duck is qucking");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }
}