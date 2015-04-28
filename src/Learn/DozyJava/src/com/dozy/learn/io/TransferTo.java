//: io/TransferTo.java
package com.dozy.learn.io;

// Using transferTo() between channels
// {Args: TransferTo.java TransferTo.txt}
import java.nio.channels.*;
import java.io.*;

public class TransferTo {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
/*        if (args.length != 2) {
            System.out.println("arguments: sourcefile destfile");
            System.exit(1);
        }*/
        String[] argx = { "src\\com\\dozy\\learn\\io\\TransferTo.java",
                "bin\\TransferTo.txt" };
        FileChannel in = new FileInputStream(argx[0]).getChannel(), out = new FileOutputStream(
                argx[1]).getChannel();
        in.transferTo(0, in.size(), out);
        // Or:
        // out.transferFrom(in, 0, in.size());
    }
} // /:~
