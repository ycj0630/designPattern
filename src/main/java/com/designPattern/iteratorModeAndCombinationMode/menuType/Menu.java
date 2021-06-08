/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode.menuType;

import com.designPattern.iteratorModeAndCombinationMode.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Menu.java, v 0.1 2021年06月08日 20:18 wb-ycj545508 Exp $
 */
public class Menu extends MenuComponent {

    public String name;

    public String desc;

    private List<MenuComponent> menuComponents;

    public Menu(String name,String desc){
        menuComponents = new ArrayList<MenuComponent>();
        this.desc = desc;
        this.name = name;
    }

    @Override
    public void print() {

        System.out.println("name: "+ name + ", desc: "+desc);
        System.out.println("---------------------------------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public void addItem(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}