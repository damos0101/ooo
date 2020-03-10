package com.company;
import java.util.Random;
public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double lenght(double x,double y,double z) {
        return Math.sqrt(x * x + y * y + z * z);
    }
    private double x1,x2,y1,y2,z1,z2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }

    public double getZ2() {
        return z2;
    }

    public void setZ2(double z2) {
        this.z2 = z2;
    }

    public double scalarProduct(){
        return x1*x2+y1*y2+z1*z2;
    }
    public double vectorProduct(double a1, double a2, double b1, double b2){
        return a1*b2-b1*a2;
    }
    public double cosVector(){
        return scalarProduct()/(lenght(x1,y1,z1)*lenght(x2,y2,z2));
    }
    public double sumVector(double a1,double a2){
        return a1+a2;
    }
    public double diffVector(double a1,double a2){
        return a1-a2;
    }
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }
}
