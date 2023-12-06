package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List <FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();
    FoodInADish<Food> strawberryDish = new FoodInADish<Food>();
    FoodInADish<Food> bananaDish = new FoodInADish<Food>();
    FoodInADish<Food> pepperDish = new FoodInADish<Food>();

    //apple
    Food strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setKg(2.5);
        ((Fruit)strawberry).setReadyToEat(true);

        strawberryDish.setFood(strawberry);
        strawberryDish.setDishColor("green");
        dishes.add(strawberryDish);

    //banana
    Food banana = new Fruit();
        banana.setName("banana");
        banana.setKg(1.8);
        ((Fruit)banana).setReadyToEat(true);

        bananaDish.setFood(banana);
        bananaDish.setDishColor("white");
        dishes.add(bananaDish);

    //pepper
    Food pepper = new Vegetable();
        pepper.setName("pepper");
        pepper.setKg(4.2);
        ((Vegetable)pepper).setFresh(true);

        pepperDish.setFood(pepper);
        pepperDish.setDishColor("blue");
        dishes.add(pepperDish);

        //System.out.println(strawberryDish.compareTo(bananaDish));

        Collections.sort(dishes);

        JFrame fr  = new JFrame("Food");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800,800);
        fr.setLayout();

        for (FoodInADish<Food> current : dishes)
        {
            JPanel p = current.draw();
            p.setBounds(0,0,current.getWidth(),current.getHeight());
            fr.add(current.draw());
        }

        fr.setVisible(true);
    }
}
