package com.example.demoqqbot.listener;

import net.itbaima.robot.event.RobotListener;
import net.itbaima.robot.event.RobotListenerHandler;
import net.mamoe.mirai.event.events.FriendMessageEvent;

@RobotListener
public class testHandler {

    @RobotListenerHandler
    public void MessageHandler(FriendMessageEvent event){
        String message = event.getMessage().contentToString();
        System.out.println(message);
    }
}
