//: generics/SimplerPets.java
package com.dozy.learn.generics;

import com.dozy.learn.typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class SimplerPets {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} // /:~
