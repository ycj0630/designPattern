/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode.furniture.commands;

import com.designPattern.commandMode.Command;
import com.designPattern.commandMode.furniture.Light;

/**
 *
 * @author wb-ycj545508
 * @version $Id: LightOnCommand.java, v 0.1 2021年06月03日 17:44 wb-ycj545508 Exp $
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}