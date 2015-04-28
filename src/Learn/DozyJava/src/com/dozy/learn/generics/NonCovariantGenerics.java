//: generics/NonCovariantGenerics.java
package com.dozy.learn.generics;

// {CompileTimeError} (Won't compile)
import java.util.*;

@SuppressWarnings("unused")
public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    // err List<Fruit> flist = new ArrayList<Apple>();
} // /:~
