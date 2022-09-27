package com.example.ideaplugindemo;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class HelloWorldAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        System.err.println("一个hello world action被点击了");

        //同时发动一个通知event
        NotificationGroup notificationGroup = new NotificationGroup("id1", NotificationDisplayType.BALLOON,true);
        Notification oneN = notificationGroup.createNotification("一个通知", NotificationType.ERROR);
        Notifications.Bus.notify(oneN);
    }
}
