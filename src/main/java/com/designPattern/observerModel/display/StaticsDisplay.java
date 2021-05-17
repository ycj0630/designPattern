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
 * @version $Id: StaticsDisplay.java, v 0.1 2021年05月17日 17:40 wb-ycj545508 Exp $
 */
public class StaticsDisplay extends PublishObserver implements DisplayElement {

    private String value;

    public StaticsDisplay(Subject wheatherData) {
        super.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println(value);
    }

    @Override
    public void update() {
        value = new String ("开发者自己的公告板");
    }
}