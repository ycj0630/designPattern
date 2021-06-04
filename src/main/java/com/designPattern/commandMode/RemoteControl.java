/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode;

import com.designPattern.commandMode.furniture.commands.NoCommand;

/**
 *
 * @author wb-ycj545508
 * @version $Id: RemoteControl.java, v 0.1 2021年06月03日 19:24 wb-ycj545508 Exp $
 */
public class RemoteControl {

    private Command [] onCmd;

    private Command [] offCmd;

    private Command undoCommand;

    private Command noCommand = new NoCommand();

    public RemoteControl() {
        this.onCmd = new Command[7];
        this.offCmd = new Command[7];
        initCommands(onCmd);
        initCommands(offCmd);
        undoCommand = noCommand;
    }

    public void setCommand(int index, Command onCmd, Command offCmd){
        this.onCmd[index] = onCmd;
        this.offCmd[index] = offCmd;
    }

    public void pressButtonOn(int i){
        onCmd[i].execute();
        undoCommand = onCmd[i];
    }

    public void pressButtonOff(int i){
        offCmd[i].execute();
        undoCommand = offCmd[i];
    }

    public void pressUndoButton(){
        undoCommand.undo();
    }

    private void initCommands(Command [] commands){

        for (Command command : commands){
            command = noCommand;
        }
    }

}