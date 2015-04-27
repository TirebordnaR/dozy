package com.dozy.learn;
import com.dozy.learn.object.*;

public class LearnJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hey java, you're good. 才怪咧！");

        int i = 0;
        switch (i) {
        case 1:
            dozyA1Object();
            break;
        case 2:
            break;
        default:
            break;
        }
    }

    private static void dozyA1Object() {
        HelloDate.dozy_main(null);
        ShowProperties.dozy_main(null);
    }
}
