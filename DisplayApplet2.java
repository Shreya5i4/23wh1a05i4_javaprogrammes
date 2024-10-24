package javaproject_23wh1a05i4;
import java.applet.*;
import java.awt.*;
public class DisplayApplet2 extends Applet {
	 
	
	public void paint(Graphics g) {
		Object color;
		setForeground(color.blue);
		setBackground(color.pink);
		g.drawString("Welcome to Applet",50,60);

}
	public static void main(String[] args) {
        new DisplayApplet2();
    }
}