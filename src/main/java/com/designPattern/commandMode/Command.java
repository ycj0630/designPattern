/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode;

/**
 *
 * @author wb-ycj545508
 * @version $Id: Command.java, v 0.1 2021年06月03日 17:40 wb-ycj545508 Exp $
 */
public interface Command {

    public void execute();

    public void undo();
}