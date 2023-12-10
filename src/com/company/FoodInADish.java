package com.company;

import javax.swing.*;
import java.awt.*;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;

    FoodInADish() {
        this.food = (T) new Object();
        this.dishColor = "";
    }

    FoodInADish(T food, String dishColor) {
        this.food = food;
        this.dishColor = dishColor;
    }


    @Override
    public JPanel draw() {
        JPanel jp =  new JPanel();
        jp.setBounds(0,0,200,400);
        ImageIcon imgFood = new ImageIcon("resources/"+food+".png");
        ImageIcon imgPlate = new ImageIcon("resources/"+dishColor+".png");

        JLabel foodLbl = new JLabel(imgFood);
        JLabel plateLbl = new JLabel(imgPlate);

        foodLbl.setBounds(0,0,200, 200);
        plateLbl.setBounds(0,200,200,200);

        jp.add(foodLbl);
        jp.add(plateLbl);

        return jp;
    }

    @Override
    public int compareTo(FoodInADish<T> f) {
        if(f.getFood() instanceof Fruit && this.food instanceof Fruit){
            return Double.compare(((Fruit) this.food).getKg(),((Fruit)f.getFood()).getKg());
        } else if(f.getFood() instanceof Vegetable && this.food instanceof Vegetable){
            return Double.compare(((Vegetable) this.food).getKg(),((Vegetable)f.getFood()).getKg());
        } else {
            if(this.food instanceof Fruit) return -1;
            else return  1;
        }
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }
}
