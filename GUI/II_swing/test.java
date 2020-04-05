package GUI.II_swing;

import javax.swing.*;
import java.awt.event.ActionListener;

public class test {
    public void addActionListener(ActionListener l)
    {
        textField1.addActionListener(l);
    }

    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;

    public test()
    {
    }
}
