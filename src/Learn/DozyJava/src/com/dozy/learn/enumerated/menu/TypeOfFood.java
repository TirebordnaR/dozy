//: enumerated/menu/TypeOfFood.java
package com.dozy.learn.enumerated.menu;

import static com.dozy.learn.enumerated.menu.Food.*;

public class TypeOfFood {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
} // /:~
