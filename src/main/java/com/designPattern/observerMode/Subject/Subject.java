/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerMode.Subject;

import com.designPattern.observerMode.observer.PublishObserver;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Subject.java, v 0.1 2021年05月17日 15:34 wb-ycj545508 Exp $
 */
public interface Subject {

    public void registerObserver(PublishObserver observer);

    public void removeObserver(PublishObserver observer);

    public void notifyObserver();

    public String getTemplate();

    public String getHumidity();

    public String getPressure();
}