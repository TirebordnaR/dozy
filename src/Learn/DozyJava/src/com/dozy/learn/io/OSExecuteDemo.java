//: io/OSExecuteDemo.java
package com.dozy.learn.io;

// Demonstrates standard I/O redirection.
import net.mindview.util.*;

public class OSExecuteDemo {
    public static void main(String[] args) {
        //OSExecute.command("javap OSExecuteDemo");
        OSExecute.command("dir");
    }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
