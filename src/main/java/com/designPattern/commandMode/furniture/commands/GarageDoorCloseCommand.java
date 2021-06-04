/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode.furniture.commands;

import com.designPattern.commandMode.Command;
import com.designPattern.commandMode.furniture.GarageDoor;

/**
 *
 * @author wb-ycj545508
 * @version $Id: GarageDoorCloseCommand.java, v 0.1 2021年06月04日 11:44 wb-ycj545508 Exp $
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}