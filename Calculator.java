package javaproject_23wh1a05i4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    String msg = "";
    int p, q, result;
    JTextField t1;
    JButton[] b = new JButton[10];
    JButton add, sub, mul, div, clear, mod, EQ;
    char OP;

    public Calculator() {
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
        
        if (Character.isDigit(ch)) {
            t1.setText(t1.getText() + str);
        } else if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
            if (!t1.getText().isEmpty()) { // Check if text field is not empty
                p = Integer.parseInt(t1.getText());
                OP = str.charAt(0); // Use the operator directly
                t1.setText("");
            } else {
                t1.setText("Enter a number");
            }
        } else if (str.equals("=")) {
            if (!t1.getText().isEmpty()) { // Check if text field is not empty
                q = Integer.parseInt(t1.getText());
                switch (OP) {
                    case '+':
                        result = p + q;
                        break;
                    case '-':
                        result = p - q;
                        break;
                    case '*':
                        result = p * q;
                        break;
                    case '/':
                        try {
                            result = p / q;
                        } catch (ArithmeticException e) {
                            t1.setText("Error");
                            return;
                        }
                        break;
                    case '%':
                        result = p % q;
                        break;
                }
                t1.setText("" + result);
            } else {
                t1.setText("Enter a number");
            }
        } else if (str.equals("Clear")) {
            t1.setText("");
        }
    }


    public static void main(String[] args) {
        new Calculator();
    }
}
