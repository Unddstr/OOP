package ru.panteleev.homework1;

import ru.panteleev.lesson1.Product;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        HotDrink tea = new HotDrink("tea", 80, 300,75);
        HotDrink greenTea = new HotDrink("greenTea", 80, 300,60);
        HotDrink coffee = new HotDrink("coffee", 120, 200,85);
        ArrayList<Product> productList= new ArrayList<>();


        productList.add(tea);
        productList.add(greenTea);
        productList.add(coffee);

        HotDrinkVendingMachine hdvm1 = new HotDrinkVendingMachine(productList);

        System.out.println(hdvm1.getProduct("tea", 300,75));
        System.out.println(hdvm1.getProduct("greenTea", 300, 60));
        System.out.println(hdvm1.getProduct("coffee", 200, 85));
    }

}
