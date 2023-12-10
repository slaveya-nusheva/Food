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
    FoodInADish<Food> blueberryDish = new FoodInADish<Food>();

    //strawberry
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
        bananaDish.setDishColor("yellow");
        dishes.add(bananaDish);

    //pepper
    Food blueberry = new Vegetable();
        blueberry.setName("blueberry");
        blueberry.setKg(4.2);
        ((Vegetable)blueberry).setFresh(true);

        blueberryDish.setFood(blueberry);
        blueberryDish.setDishColor("blue");
        dishes.add(blueberryDish);

        //System.out.println(strawberryDish.compareTo(bananaDish));

        Collections.sort(dishes);

        JFrame fr  = new JFrame("Food");
        fr.setSize(800,400);
      fr.setLayout(new GridLayout(1,12));

        for (FoodInADish<Food> current : dishes)
        {
            JPanel p = current.draw();
            p.setBounds(0,0,current.getWidth(),current.getHeight());
            fr.add(p);
        }
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
