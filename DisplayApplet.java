package javaproject_23wh1a05i4;
import javax.swing.*;
import java.awt.*;

public class DisplayApplet extends JFrame {
    public DisplayApplet() {
        setTitle("Display Applet");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g); // Call to the superclass's paint method
        setForeground(Color.BLUE);
        setBackground(Color.PINK);
        g.drawString("Welcome to Applet", 50, 60);
    }

    public static void main(String[] args) {
        new DisplayApplet();
    }
}

