//: generics/NeedCasting.java
package com.dozy.learn.generics;

import java.io.*;
import java.util.*;

public class NeedCasting {
    @SuppressWarnings({ "unchecked", "resource", "unused" })
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                args[0]));
        List<Widget> shapes = (List<Widget>) in.readObject();
    }
} // /:~
