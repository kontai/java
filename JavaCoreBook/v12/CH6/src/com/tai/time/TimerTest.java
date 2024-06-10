package com.tai.time;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public  class TimerTest{
    public static void main(String[] args) {
        var listener = new TimerPrinter();
        Timer t=new Timer(1000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

 class TimerPrinter implements ActionListener, java.awt.event.ActionListener {

    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone,the time is"
        + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }

}
