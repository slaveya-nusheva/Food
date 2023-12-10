package com.company;

public class Fruit extends Food implements Comparable<Fruit>{
    boolean isReadyToEat;

    Fruit(){
        super();
        this.isReadyToEat=true;
    }



    Fruit(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isReadyToEat = isReadyToEat;
    }

    public boolean isReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean readyToEat) {
        isReadyToEat = readyToEat;
    }

    @Override
    public String toString() {
        return getName();
    }
    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
