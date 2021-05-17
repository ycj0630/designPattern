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
 * @version $Id: CunrrentConditionsDisplay.java, v 0.1 2021年05月17日 17:40 wb-ycj545508 Exp $
 */
public class CunrrentConditionsDisplay extends PublishObserver implements DisplayElement {

    private String temperature;

    private String humidity;

    private String pressure;

    public CunrrentConditionsDisplay(Subject wheatherData) {
        super.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("气温："+ temperature + ", 湿度："+ humidity + ", 气压：" + pressure);
    }

    @Override
    public void update() {
        setHumidity(wheatherData.getHumidity());
        setPressure(wheatherData.getPressure());
        setTemperature(wheatherData.getTemplate());
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}