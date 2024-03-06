package sio.demo;

import java.util.Random;

public class Point {
    private double x, y;

    public Point(double abscisse, double ordonnee) {
        this.x = abscisse;
        this.y = ordonnee;
    }

    public static double alea(double inf, double sup) {
        Random random = new Random();
        return Math.round((random.nextDouble((sup - inf) ) + inf)*100.0)/100.0;
    }


    public String affiche(){
        return "("+this.x+";"+this.y+")";
    }

    public double affiche(Point p){
        return Math.sqrt(Math.pow(p.getX()-this.getX(), 2) + Math.pow(p.getY()-this.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
