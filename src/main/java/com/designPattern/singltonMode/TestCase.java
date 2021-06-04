/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.singltonMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: TestCase.java, v 0.1 2021年06月02日 16:12 wb-ycj545508 Exp $
 */
public class TestCase {

    public static void main(String[] args) {
        MyObject mo1 = MyObject.getMyObject1();
        MyObject mo2 = MyObject.getMyObject1();
        System.out.println(mo1.hashCode() == mo2.hashCode());
        System.out.println(mo1.equals(mo2));

    }

}