/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode.furniture.commands;

import com.designPattern.commandMode.Command;

/**
 *
 * @author wb-ycj545508
 * @version $Id: NoCommand.java, v 0.1 2021年06月04日 11:46 wb-ycj545508 Exp $
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("there is no Command on execute");
    }

    @Override
    public void undo() {
        System.out.println("there is no Command on undo");
    }
}