package com.company;

public class Vegetable extends Food{
    boolean isFresh;

    Vegetable(){
        super();
        this.isFresh=true;
    }

    Vegetable(String name, double kg, boolean IsFresh){
        super(name,kg);
        this.isFresh=true;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "isFresh=" + isFresh +
                '}';
    }
}
