/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode.furniture.commands;

import com.designPattern.commandMode.Command;
import com.designPattern.commandMode.furniture.Light;

/**
 *
 * @author wb-ycj545508
 * @version $Id: LightOffCommand.java, v 0.1 2021年06月04日 11:43 wb-ycj545508 Exp $
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}