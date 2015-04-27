//: generics/LimitsOfInference.java
package com.dozy.learn.generics;

import com.dozy.learn.typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
} // /:~
