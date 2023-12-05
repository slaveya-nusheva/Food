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

    Food apple = new Fruit();
        apple.setName("apple");
        apple.setKg(2.5);
        ((Fruit)apple).setReadyToEat(true);

        appleDish.setFood(apple);
        appleDish.setDishColor("purple");
        dishes.add(appleDish);

    Food banana = new Fruit();
        banana.setName("banana");
        banana.setKg(1.8);
        ((Fruit)banana).setReadyToEat(true);

        bananaDish.setFood(banana);
        bananaDish.setDishColor("blue");
        dishes.add(bananaDish);

    Food pepper = new Vegetable();
        pepper.setName("pepper");
        pepper.setKg(4.2);
        ((Vegetable)pepper).setFresh(true);

        pepperDish.setFood(pepper);
        pepperDish.setDishColor("yellow");
        dishes.add(pepperDish);

        System.out.println(appleDish.compareTo(bananaDish));

        Collections.sort(dishes);

        JFrame fr  = new JFrame("Food");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        for (FoodInADish<Food> current : dishes)
        {
            JPanel p = current.draw();
            fr.add(current.draw());
        }

        fr.setSize(400,400);
        fr.setVisible(true);
    }
}
