// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
            Expo.drawRectangle(g,50,150,250,350);
            Expo.drawRectangle(g,150,250,350,450);
            Expo.drawLine(g,50,150,150,250);
            Expo.drawLine(g,250,350,350,450);
            Expo.drawLine(g,50,350,150,450);
            Expo.drawLine(g,250,150,350,250);


        // DRAW TARGET
            Expo.drawCircle(g,650,300,100);
            Expo.drawCircle(g,650,300,50);
            Expo.drawCircle(g,650,300,150);
            Expo.drawCircle(g,650,300,200);
            Expo.drawCircle(g,650,300,250);

        // DRAW TRIANGLE
            Expo.drawLine(g,775,600,775,900);
            Expo.drawLine(g,775,600,675,900);
            Expo.drawLine(g,775,600,875,900);
            Expo.drawLine(g,675,900,875,900);
            Expo.drawLine(g,675,900,825,750);
            Expo.drawLine(g,875,900,725,650);


        // DRAW SMILEY FACE






        // DRAW JPII






    }

}


