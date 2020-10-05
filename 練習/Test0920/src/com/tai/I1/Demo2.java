package com.tai.I1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Demo2 implements ActionListener {
    public static void main(String[] args)
    {

        ActionListener d2=new Demo2();
        Timer timer=new Timer(10000,d2);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        String message=JOptionPane.showInputDialog("asdfkj");
        System.out.println("Message="+message);
        System.exit(0);
    /*
        while (true)
        {
            if ((System.currentTimeMillis() % 10000) == 0)
            {
                new Demo2().actionPerformed(null);
            }
        }
         */

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("At the time  , the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
