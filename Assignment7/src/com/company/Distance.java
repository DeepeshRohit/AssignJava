package com.company;

public class Distance{
    int Feet;
    float inches;

    void set(int Feet, float inches) {
        this.Feet=Feet;
        this.inches=inches;
    }

    public int getFeet() {
        return Feet;
    }

    public float getInches() {
        return inches;
    }

    public void display() {
        System.out.println("Distance : "+this.Feet+" feets "+this.inches+" inches ");
    }

    public static Distance sum(Distance d1,Distance d2) {
        Distance d3=new Distance();
        int feet=d1.getFeet()+d2.getFeet();
        float inches=d1.getInches()+d2.getInches();
        d3.set(feet,inches);
        return d3;
    }
}
class DistanceMain {

    public static void main(String[] args) {
        Distance dis1 = new Distance();
        dis1.set(2, 4.2f);
        Distance dis2 = new Distance();
        dis2.set(3, 5.5f);
        Distance dis3 = Distance.sum(dis1, dis2);
        dis3.display();

    }
}
