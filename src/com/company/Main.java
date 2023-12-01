package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List <FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();
    FoodInADish<Food> appleDish = new FoodInADish<Food>();
    FoodInADish<Food> bananaDish = new FoodInADish<Food>();
    FoodInADish<Food> pepperDish = new FoodInADish<Food>();

    Fruit apple = new Fruit();
        appleDish.setFood(apple);
        appleDish.setDishColor("white");
        apple.setKg(2.5);
        dishes.add(appleDish);

    Fruit banana = new Fruit();
        bananaDish.setFood(banana);
        bananaDish.setDishColor("yellow");
        banana.setKg(1.8);
        dishes.add(bananaDish);

    Vegetable pepper = new Vegetable();
        pepperDish.setFood(pepper);
        pepperDish.setDishColor("red");
        pepper.setKg(4.2);
        dishes.add(pepperDish);

        System.out.println(appleDish.compareTo(bananaDish));

        Collections.sort(dishes);

        JFrame fr  = new JFrame('')



        for (FoodInADish<Food> f : dishes)
        {
            fr.add(f.draw());
        }


    }
}
