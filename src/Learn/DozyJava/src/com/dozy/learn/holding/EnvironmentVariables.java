//: holding/EnvironmentVariables.java
package com.dozy.learn.holding;

import java.util.*;

public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
} /* (Execute to see output) */// :~
