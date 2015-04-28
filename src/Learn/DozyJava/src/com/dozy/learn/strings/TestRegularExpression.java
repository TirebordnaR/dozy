//: strings/TestRegularExpression.java
package com.dozy.learn.strings;

// Allows you to easily try out regular expressions.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class TestRegularExpression {
    public static void main(String[] args) {
/*        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression "
                    + "characterSequence regularExpression+");
            System.exit(0);
        }*/
        String[] argx = { "abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}" };
        print("Input: \"" + argx[0] + "\"");
        for (String arg : argx) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(argx[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " + m.start()
                        + "-" + (m.end() - 1));
            }
        }
    }
} /* Output:
Input: "abcabcabcdefabc"
Regular expression: "abcabcabcdefabc"
Match "abcabcabcdefabc" at positions 0-14
Regular expression: "abc+"
Match "abc" at positions 0-2
Match "abc" at positions 3-5
Match "abc" at positions 6-8
Match "abc" at positions 12-14
Regular expression: "(abc)+"
Match "abcabcabc" at positions 0-8
Match "abc" at positions 12-14
Regular expression: "(abc){2,}"
Match "abcabcabc" at positions 0-8
*///:~
