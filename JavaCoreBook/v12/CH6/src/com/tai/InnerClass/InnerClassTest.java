package com.tai.InnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;

/**
 * This program demonstrates the use of inner classes.
 *
 * @author Cay Horstmann
 * @version 1.11 2017-12-14
 */
public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

        var bob=new Object(){String name="Bob";};
        System.out.println(bob.name);
    }
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock {
    private int interval;
    private boolean beep;


    /**
     * Constructs a talking clock
     *
     * @param interval the interval between messages (in milliseconds)
     * @param beep     true if the clock should beep
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Starts the clock.
     */
    public void start() {
        var listener = new TimePrinter();
//       var listener = this.new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    /*
    反編譯得到this$0(外部類的引用)
    public class com.tai.InnerClass.TalkingClock$TimePrinter implements java.awt.event.ActionListener {
      final com.tai.InnerClass.TalkingClock this$0;
      public com.tai.InnerClass.TalkingClock$TimePrinter(com.tai.InnerClass.TalkingClock);
      public void actionPerformed(java.awt.event.ActionEvent);
    }
     */
    public class TimePrinter implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is "
                    + Instant.ofEpochMilli(event.getWhen()));
//         if (beep) Toolkit.getDefaultToolkit().beep();
            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
