/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.designPattern.commandMode;

import com.designPattern.commandMode.furniture.GarageDoor;
import com.designPattern.commandMode.furniture.Light;
import com.designPattern.commandMode.furniture.commands.GarageDoorCloseCommand;
import com.designPattern.commandMode.furniture.commands.GarageDoorOpenCommand;
import com.designPattern.commandMode.furniture.commands.LightOffCommand;
import com.designPattern.commandMode.furniture.commands.LightOnCommand;


/**
 *
 * @author wb-ycj545508
 * @version $Id: RemoteControlTest.java, v 0.1 2021年06月03日 17:50 wb-ycj545508 Exp $
 */

public class RemoteControlTest {

    public static void main(String[] args) {

        Controller controller = new Controller();

        Light light = new Light();
        GarageDoor door = new GarageDoor();


        controller.setCommand(new LightOnCommand(light));
        controller.pressButton();

        controller.setCommand(new GarageDoorOpenCommand(door));
        controller.pressButton();

        System.out.println("======================  TEST 2 ======================");

        RemoteControl rc = new RemoteControl();
        rc.setCommand(0 ,new LightOnCommand(light), new LightOffCommand(light));
        rc.setCommand(1 ,new GarageDoorOpenCommand(door), new GarageDoorCloseCommand(door));

        rc.pressButtonOn(0);
        rc.pressButtonOff(0);
        rc.pressUndoButton();

        rc.pressButtonOff(1);
        rc.pressButtonOn(1);
        rc.pressUndoButton();

    }

}