/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel.Subject;

import java.util.Observable;

/**
 *
 * @author wb-ycj545508
 * @version $Id: WheatherData.java, v 0.1 2021年05月17日 15:37 wb-ycj545508 Exp $
 */
public class WheatherData extends Observable {

    private String temperature;

    private String humidity;

    private String pressure;

    private String minValue;

    private String maxValue;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }


    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
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

    public String getTemperature() {
        return temperature;
    }

    public String getMinValue() {
        return minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }
}