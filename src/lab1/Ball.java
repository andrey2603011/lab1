package lab1;

import java.lang.*;
public class Ball {
    private String color;
    private int circuit;
    private double weight;
    public Ball(String c,int cir,double w){
        color = c;
        circuit = cir;
        weight =w;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setRadius(int radius){
        this.circuit = radius;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return circuit;
    }
    public double getWeight(){
        return weight;
    }
    public String toString() {return "color:"+this.color+",radius:"+this.circuit+",weight:"+this.weight;
    }
}