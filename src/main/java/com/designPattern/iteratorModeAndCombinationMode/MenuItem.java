/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: MenuItem.java, v 0.1 2021年06月08日 20:28 wb-ycj545508 Exp $
 */
public class MenuItem extends MenuComponent {

    private boolean isVeget;

    private int price;

    public String name;

    public String desc;

    public MenuItem(String name, String desc,boolean isVeget, int price ) {
        this.isVeget = isVeget;
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void print() {
        System.out.println("name: "+name+", desc: "+desc+ ", veget: "+ (isVeget?"素":"荤")+ ", price: "+price);
        System.out.println("----------------------------------------------");

    }

    public boolean isVeget() {
        return isVeget;
    }

    public void setVeget(boolean veget) {
        isVeget = veget;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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