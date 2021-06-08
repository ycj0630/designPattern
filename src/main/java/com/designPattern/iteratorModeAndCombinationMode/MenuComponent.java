/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: MenuComponent.java, v 0.1 2021年06月08日 20:12 wb-ycj545508 Exp $
 */
public abstract class MenuComponent {


    protected void addItem(MenuComponent menuComponent){
        throw new UnsupportedOperationException("不支持此操作");
    }

    protected void removeItem(MenuComponent menuComponent){
        throw new UnsupportedOperationException("不支持此操作");
    }

    public abstract void print();











}