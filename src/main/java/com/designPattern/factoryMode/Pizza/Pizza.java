/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.factoryMode.Pizza;

import com.designPattern.factoryMode.ingredient.*;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Pizza.java, v 0.1 2021年05月25日 18:52 wb-ycj545508 Exp $
 */
public abstract class Pizza {

    protected String name;

    protected Cheese cheese;

    protected Clams clams;

    protected Dough dough;

    protected Pepperoni pepperoni;

    protected Sauce sauce;

    protected Veggie [] veggies;

    public abstract void prepare();

    public void bake(){
        System.out.println("baking for pizza with 25 minutes");
    };

    public void cut(){
        System.out.println("cutting for pizza");
    };

    public void box(){
        System.out.println("boxing for pizza");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggie[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggie[] veggies) {
        this.veggies = veggies;
    }
}