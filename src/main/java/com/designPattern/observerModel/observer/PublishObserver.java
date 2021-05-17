/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel.observer;

import com.designPattern.observerModel.Subject.Subject;

/**
 *
 * @author wb-ycj545508
 * @version $Id: PublishObserver.java, v 0.1 2021年05月17日 15:38 wb-ycj545508 Exp $
 */
public abstract class PublishObserver {

    protected Subject wheatherData;

    public abstract void update();

}