/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.iteratorModeAndCombinationMode;

import com.designPattern.iteratorModeAndCombinationMode.menuType.Menu;

/**
 *
 * @author wb-ycj545508
 * @version $Id: testCase.java, v 0.1 2021年06月08日 16:53 wb-ycj545508 Exp $
 */
public class testCase {

    public static void main(String[] args) {

        MenuComponent allMenu = new Menu("总菜单","这是总菜单");


        MenuComponent breakfast = new Menu("早餐菜单","这是菜单");
        MenuComponent baozi = new MenuItem("包子","这是菜单项",false,1);
        MenuComponent youtiao = new MenuItem("油条","这是菜单项",true,2);


        breakfast.addItem(baozi);
        breakfast.addItem(youtiao);
        allMenu.addItem(breakfast);

        MenuComponent lauch = new Menu("午餐菜单","这是菜单");
        MenuComponent rou = new MenuItem("红烧肉","这是菜单项",false,10);
        MenuComponent qingcai = new MenuItem("香菇青菜","这是菜单项",true,5);

        MenuComponent afternoon = new Menu("下午茶菜单","这是菜单");
        MenuComponent tiandian = new MenuItem("甜点","这是菜单项",true,8);
        MenuComponent lvcha = new MenuItem("绿茶","这是菜单项",true,12);


        lauch.addItem(rou);
        lauch.addItem(qingcai);
        afternoon.addItem(tiandian);
        afternoon.addItem(lvcha);
        lauch.addItem(afternoon);

        allMenu.addItem(lauch);


        Waitress w = new Waitress(allMenu);
        w.printItems();
    }
}