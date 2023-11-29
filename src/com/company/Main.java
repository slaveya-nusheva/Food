package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List <FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();
    FoodInADish<Food> appleDish = new FoodInADish<Food>();
    FoodInADish<Food> bananaDish = new FoodInADish<Food>();
    FoodInADish<Food> pepperDish = new FoodInADish<Food>();

    Fruit apple = new Fruit();
        appleDish.setFood(apple);
        appleDish.setDishColor("blue");
        dishes.add(appleDish);

    Fruit banana = new Fruit();
        bananaDish.setFood(banana);
        bananaDish.setDishColor("purple");
        dishes.add(bananaDish);

    Vegetable pepper = new Vegetable();
        pepperDish.setFood(pepper);
        pepperDish.setDishColor("green");
        dishes.add(pepperDish);

        appleDish.compareTo(bananaDish);
    }
}
