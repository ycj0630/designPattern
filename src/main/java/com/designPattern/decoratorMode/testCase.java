/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.decoratorMode;

import com.designPattern.decoratorMode.decorated.Decaf;
import com.designPattern.decoratorMode.decorators.condiments.Mocha;
import com.designPattern.decoratorMode.decorators.condiments.Soy;
import com.designPattern.decoratorMode.decorators.condiments.Whip;

/**
 *
 * @author wb-ycj545508
 * @version $Id: TestCase.java, v 0.1 2021年05月19日 18:52 wb-ycj545508 Exp $
 */
public class testCase {

    public static void main(String[] args) {

        //双倍摩卡豆浆奶泡拿铁咖啡
        Whip whip = new Whip(new Decaf());
        Soy soy = new Soy(whip);
        Mocha mocha1 = new Mocha(soy);
        Mocha mocha2 = new Mocha(mocha1);

        System.out.println("调料:" + mocha2.getDesc()+", 价格:"+ mocha2.cost());

    }
}