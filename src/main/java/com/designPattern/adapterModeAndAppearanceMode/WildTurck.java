/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.adapterModeAndAppearanceMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: WildTurck.java, v 0.1 2021年06月04日 16:59 wb-ycj545508 Exp $
 */
public class WildTurck implements Turck {
    @Override
    public void gobble() {
        System.out.println("turck is gobbling");
    }

    @Override
    public void fly() {
        System.out.println("turck is flying");

    }
}