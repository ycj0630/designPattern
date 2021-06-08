/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode.iterators;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author wb-ycj545508
 * @version $Id: PancakeHouseIterator.java, v 0.1 2021年06月08日 16:41 wb-ycj545508 Exp $
 */
public class PancakeHouseIterator implements Iterator {

    private List pancakeHouseMenu;

    private int position = 0;

    public PancakeHouseIterator(List pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    @Override
    public boolean hasNext() {

        if(position >= pancakeHouseMenu.size() || null == pancakeHouseMenu.get(position)){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if(position < pancakeHouseMenu.size()){
            Object o = pancakeHouseMenu.get(position);
            position++;
            return o;
        }

        return null;
    }
}