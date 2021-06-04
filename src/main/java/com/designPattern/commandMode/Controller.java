/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Controller.java, v 0.1 2021年06月03日 17:46 wb-ycj545508 Exp $
 */
public class Controller {

    private Command command;

    public void pressButton(){
        if(null != command){
            command.execute();
        }
    }

    public void setCommand(Command command) {
        this.command = command;
    }


}