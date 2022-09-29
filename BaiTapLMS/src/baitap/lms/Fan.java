package baitap.lms;

import javax.jws.soap.SOAPMessageHandlers;

public class Fan {
    private final int SLOW= 1;
    private final int MEDIUM =2;
    private final int FAST = 3;
    private int speed ;
    private double radius;
    private String color;
    private boolean on = false;

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public Fan(){
    }
    public boolean isOn(){
        return on;
    }
    public void setOn(){
        this.on=true;
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(this.isOn()){
            return "Fan{" +
                    "speed=" + getSpeed() +
                    ", fan is on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan{"+ "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
