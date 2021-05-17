/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel.Subject;

import com.designPattern.observerModel.Subject.Subject;
import com.designPattern.observerModel.observer.PublishObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wb-ycj545508
 * @version $Id: WheatherData.java, v 0.1 2021年05月17日 15:37 wb-ycj545508 Exp $
 */
public class WheatherData implements Subject {

    private List<PublishObserver> observers;

    private String temperature;

    private String humidity;

    private String pressure;

    public WheatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(PublishObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PublishObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(PublishObserver observer : observers){
            observer.update();
        }
    }

    public void measurementsChanged(){

        notifyObserver();
    }

    @Override
    public String getTemplate() {
        return temperature;
    }

    @Override
    public String getHumidity() {
        return humidity;
    }

    @Override
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
}