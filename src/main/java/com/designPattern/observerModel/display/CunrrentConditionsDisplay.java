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
 * @version $Id: CunrrentConditionsDisplay.java, v 0.1 2021年05月17日 17:40 wb-ycj545508 Exp $
 */
public class CunrrentConditionsDisplay implements DisplayElement,Observer {

    private String temperature;

    private String humidity;

    private String pressure;

    private Observable wheatherData;

    public CunrrentConditionsDisplay(Observable wheatherData) {
        this.wheatherData = wheatherData;
        this.wheatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("气温："+ temperature + ", 湿度："+ humidity + ", 气压：" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WheatherData){
           setTemperature(((WheatherData)o).getTemperature());
           setPressure(((WheatherData) o).getPressure());
           setHumidity(((WheatherData) o).getHumidity());
        }
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