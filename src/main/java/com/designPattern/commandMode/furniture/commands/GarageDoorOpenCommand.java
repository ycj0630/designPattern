/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode.furniture.commands;

import com.designPattern.commandMode.Command;
import com.designPattern.commandMode.furniture.GarageDoor;

/**
 *
 * @author wb-ycj545508
 * @version $Id: GarageDoorOpenCommand.java, v 0.1 2021年06月03日 17:55 wb-ycj545508 Exp $
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}