/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerMode.display;

import com.designPattern.observerMode.Subject.WheatherData;
import com.designPattern.observerMode.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author wb-ycj545508
 * @version $Id: ThirdPartyDisplay.java, v 0.1 2021年05月17日 17:41 wb-ycj545508 Exp $
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {

    private String minValue;

    private String maxValue;

    private Observable wheatherData;

    public ThirdPartyDisplay(Observable wheatherData) {
        this.wheatherData = wheatherData;
        this.wheatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WheatherData){
            setMaxValue(((WheatherData) o).getMaxValue());
            setMinValue(((WheatherData) o).getMinValue());
        }

        setMaxValue(maxValue);
        setMinValue(minValue);
    }
    @Override
    public void display() {
        System.out.println("最大值："+maxValue+", 最小值："+minValue);
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

}