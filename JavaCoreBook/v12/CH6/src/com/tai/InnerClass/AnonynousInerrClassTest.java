package com.tai.InnerClass;

import com.tai.time.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.Instant;

public class AnonynousInerrClassTest {
    public static void main(String[] args) {
        var clock = new TalkClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

class TalkClock {
    public void start(int interval, boolean beep) {
        var timer = new Timer(interval, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();

            }
        });
        timer.start();
    }
}