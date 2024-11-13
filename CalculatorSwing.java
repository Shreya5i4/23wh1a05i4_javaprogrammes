package Shreya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {
    private JTextField t1;
    private JButton[] b = new JButton[10]; 
    private JButton add, sub, mul, div, clear, mod, eq;
    private char OP;
    private int p, q, result;

    public CalculatorSwing() {
        
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        t1 = new JTextField(10);
        t1.setEditable(false); // The text field should not be editable directly
        add(t1, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 grid for buttons
        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++) {
            b[i] = new JButton(String.valueOf(i));
            b[i].addActionListener(this);
            panel.add(b[i]);
        }

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        clear = new JButton("Clear");
        eq = new JButton("=");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        eq.addActionListener(this);

        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(mod);
        panel.add(clear);
        panel.add(eq);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);

      
        if (Character.isDigit(ch)) {
            t1.setText(t1.getText() + str);
        } 
       
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
        else if (str.equals("=")) {
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
                default:
                    break;
            }

            t1.setText(String.valueOf(result));
        } 
       
        else if (str.equals("Clear")) {
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        
        CalculatorSwing calculator = new CalculatorSwing();
        calculator.setVisible(true);
    }
}
