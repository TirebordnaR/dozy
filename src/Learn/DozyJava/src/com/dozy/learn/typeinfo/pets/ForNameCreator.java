//: typeinfo/pets/ForNameCreator.java
package com.dozy.learn.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
        "com.dozy.learn.typeinfo.pets.Mutt",
        "com.dozy.learn.typeinfo.pets.Pug",
        "com.dozy.learn.typeinfo.pets.EgyptianMau",
        "com.dozy.learn.typeinfo.pets.Manx",
        "com.dozy.learn.typeinfo.pets.Cymric",
        "com.dozy.learn.typeinfo.pets.Rat",
        "com.dozy.learn.typeinfo.pets.Mouse",
        "com.dozy.learn.typeinfo.pets.Hamster" };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} // /:~
