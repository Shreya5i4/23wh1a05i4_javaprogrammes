package javaproject_23wh1a05i4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator2 extends JFrame implements ActionListener {
    String msg = "";
    int p, q, result;
    JTextField t1;
    JButton[] b = new JButton[10];
    JButton add, sub, mul, div, clear, mod, EQ;
    char OP;

    public Calculator2() {
        t1 = new JTextField(10);
        setLayout(new GridLayout(5, 4)); // Adjusted to fit all buttons

        for (int i = 0; i < 10; i++) {
            b[i] = new JButton("" + i);
            b[i].addActionListener(this);
            add(b[i]);
        }

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        clear = new JButton("Clear");
        EQ = new JButton("=");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);

        add(t1);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQ);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);
        if (Character.isDigit(ch))
            t1.setText(t1.getText() + str);
        else if (str.equals("+")) {
            p = Integer.parseInt(t1.getText());
            OP = '+';
            t1.setText("");
        } else if (str.equals("-")) {
            p = Integer.parseInt(t1.getText());
            OP = '-';
            t1.setText("");
        } else if (str.equals("*")) {
            p = Integer.parseInt(t1.getText());
            OP = '*';
            t1.setText("");
        } else if (str.equals("/")) {
            p = Integer.parseInt(t1.getText());
            OP = '/';
            t1.setText("");
        } else if (str.equals("%")) {
            p = Integer.parseInt(t1.getText());
            OP = '%';
            t1.setText("");
        }
        if (str.equals("=")) {
            q = Integer.parseInt(t1.getText());
            if (OP == '+') result = p + q;
            else if (OP == '-') result = p - q;
            else if (OP == '*') result = p * q;
            else if (OP == '/') {
                try {
                    result = p / q;
                } catch (ArithmeticException e) {
                    t1.setText("Error");
                    return;
                }
            } else if (OP == '%') result = p % q;
            t1.setText("" + result);
        }
        if (str.equals("Clear")) {
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
