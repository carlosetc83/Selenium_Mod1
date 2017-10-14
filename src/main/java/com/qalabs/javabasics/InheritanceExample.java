package com.qalabs.javabasics;


class Bike {
    public String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public  void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int getSpeed() {
        return this.speed;
    }


    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}

class RoadBike extends Bike {
    private int wheelSize;

    RoadBike(String brand) {
        super(brand);
        this.wheelSize = 26;

    }

    void speedUp() {
        this.setSpeed(this.getSpeed() + 3);
        System.out.println(String.format("%s speed %d", this.brand, this.getSpeed()));
    }

    public void setWheelSize(int newValue) {
        this.wheelSize = newValue;
    }
}

public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike");
        bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        bike = new MountainBike("mountain bike");
        bike.speedUp();

        bike = new RoadBike("Road Bike");
        bike.speedUp();

    }
}
