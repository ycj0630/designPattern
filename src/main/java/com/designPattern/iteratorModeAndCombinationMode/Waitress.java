/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode;

import java.util.Iterator;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Waitress.java, v 0.1 2021年06月08日 17:47 wb-ycj545508 Exp $
 */
public class Waitress {

    private MenuComponent allMenu;

    public Waitress(MenuComponent menu) {
        this.allMenu = menu;
    }

    public void printItems(){

        allMenu.print();
    }


}