/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel.display;

import com.designPattern.observerModel.observer.DisplayElement;
import com.designPattern.observerModel.observer.PublishObserver;
import com.designPattern.observerModel.Subject.Subject;

/**
 *
 * @author wb-ycj545508
 * @version $Id: ThirdPartyDisplay.java, v 0.1 2021年05月17日 17:41 wb-ycj545508 Exp $
 */
public class ThirdPartyDisplay extends PublishObserver implements DisplayElement {

    private String minValue;

    private String maxValue;

    public ThirdPartyDisplay(Subject wheatherData) {
        super.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("最大值："+maxValue+", 最小值："+minValue);
    }

    @Override
    public void update() {
        setMaxValue(maxValue);
        setMinValue(minValue);
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }
}