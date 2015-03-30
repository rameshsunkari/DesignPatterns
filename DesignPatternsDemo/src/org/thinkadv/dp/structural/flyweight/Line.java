package org.thinkadv.dp.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;
 
public class Line implements Shape {
 
    public Line(){
        System.out.println("Creating Line object");
        //adding time delay
        System.out.println("Your Object Creation is in queue. Please wait");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your wait is over");
        
    }
    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2,
            Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
 
}