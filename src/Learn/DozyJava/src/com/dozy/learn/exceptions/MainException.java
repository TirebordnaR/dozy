//: exceptions/MainException.java
package com.dozy.learn.exceptions;
import java.io.*;

public class MainException {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("src\\com\\dozy\\learn\\exceptions\\MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
} ///:~
