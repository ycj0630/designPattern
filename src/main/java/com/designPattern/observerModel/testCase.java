/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.observerModel;

import com.designPattern.decoratorMode.inputStreamDemo.LowerCaseinputStream;

import java.io.*;

/**
 *
 * @author wb-ycj545508
 * @version $Id: testCase.java, v 0.1 2021年05月17日 18:07 wb-ycj545508 Exp $
 */
public class testCase {

    public static void main(String[] args) throws IOException {
        //Observable wheatherData = new WheatherData();
        //
        //Observer ccd = new CunrrentConditionsDisplay(wheatherData);
        //Observer sd = new StaticsDisplay(wheatherData);
        //Observer tp = new ThirdPartyDisplay(wheatherData);
        //
        ////模拟气象站更新数据
        //((WheatherData) wheatherData).setHumidity("15.5");
        //((WheatherData) wheatherData).setPressure("20.3");
        //((WheatherData) wheatherData).setTemperature("28.1℃");
        //
        ////气象站 调用 数据中心的 measurementsChanged 方法
        //((WheatherData) wheatherData).measurementsChanged();
        //
        ////布告板显示数据
        //((CunrrentConditionsDisplay) ccd).display();
        //((StaticsDisplay) sd).display();
        //((ThirdPartyDisplay) tp).display();

        File file = new File("C:\\Users\\wb-ycj545508\\Desktop\\testDemo.txt");
        if(!file.exists()){
            return;
        }
        InputStream inputStream = null;
        try {
            inputStream = new LowerCaseinputStream(new BufferedInputStream(new FileInputStream(file)));
            int r;
            while ((r = inputStream.read())>0){
                System.out.println((char)r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream!= null){
                inputStream.close();
            }
        }
    }



}