/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel.display;

import com.designPattern.observerModel.Subject.WheatherData;
import com.designPattern.observerModel.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author wb-ycj545508
 * @version $Id: StaticsDisplay.java, v 0.1 2021年05月17日 17:40 wb-ycj545508 Exp $
 */
public class StaticsDisplay implements DisplayElement , Observer {

    private String value;

    private Observable wheatherData;

    public StaticsDisplay(Observable wheatherData) {
        this.wheatherData = wheatherData;
        this.wheatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(value);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WheatherData){
            value = new String ("开发者自己的公告板");
        }
    }
}