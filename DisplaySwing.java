package Shreya;
  
import javax.swing.*;
import java.awt.*;

public class DisplaySwing extends JFrame {

    public DisplaySwing() {
      
        setTitle("Swing Display");
        
        setSize(300, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(Color.PINK);
        
       
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);  
        g.setColor(Color.BLUE);
       
        g.drawString("Welcome to Swing", 50, 60);
    }

    public static void main(String[] args) {
       
        new DisplaySwing();
    }
}
