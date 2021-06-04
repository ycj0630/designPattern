/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.singltonMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: MyObject.java, v 0.1 2021年06月02日 15:12 wb-ycj545508 Exp $
 */
public class MyObject {

    private static MyObject object;

    private static MyObject object2 = new MyObject();


    private MyObject() {

    }
    // 方法未同步可能会有多线程问题
    public static MyObject getMyObject1(){
        if(null == object){
            object = new MyObject();
        }
        return object;
    }

    //不会有多线程问题,但是会降低很多性能
    public static synchronized MyObject getMyObject2(){
        if(null == object){
            object = new MyObject();
        }
        return object;
    }

    //不再延迟加载,可能会导致内存浪费
    public static MyObject getMyObject3(){

        return object2;
    }
}