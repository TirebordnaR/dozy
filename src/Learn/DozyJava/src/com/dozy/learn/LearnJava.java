package com.dozy.learn;

import com.dozy.learn.object.*;
import com.dozy.learn.operators.*;
import com.dozy.learn.control.*;

public class LearnJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hey java, you're good. 才怪咧！");

        int i = 3;
        switch (i) {
        case 1:
            dozyObject();
            break;
        case 2:
            dozyOperators();
            break;
        case 3:
            dozyControl();
            break;
        default:
            break;
        }
    }

    private static void dozyObject() {
        HelloDate.dozy_main(null);
        ShowProperties.dozy_main(null);
    }

    private static void dozyOperators() {
        Assignment.dozy_main(null);
        AutoInc.dozy_main(null);
        BitManipulation.dozy_main(null);
        Bool.dozy_main(null);
        Casting.dozy_main(null);
        CastingNumbers.dozy_main(null);
        EqualsMethod.dozy_main(null);
        EqualsMethod2.dozy_main(null);
        Equivalence.dozy_main(null);
        Exponents.dozy_main(null);
        HelloDate.dozy_main(null);
        Literals.dozy_main(null);
        MathOps.dozy_main(null);
        Overflow.dozy_main(null);
        PassObject.dozy_main(null);
        Precedence.dozy_main(null);
        RoundingNumbers.dozy_main(null);
        ShortCircuit.dozy_main(null);
        StringOperators.dozy_main(null);
        TernaryIfElse.dozy_main(null);
        URShift.dozy_main(null);
    }

    private static void dozyControl() {
        BreakAndContinue.dozy_main(null);
        CommaOperator.dozy_main(null);
        ForEachFloat.dozy_main(null);
        ForEachInt.dozy_main(null);
        ForEachString.dozy_main(null);
        IfElse.dozy_main(null);
        IfElse2.dozy_main(null);
        LabeledFor.dozy_main(null);
        LabeledWhile.dozy_main(null);
        ListCharacters.dozy_main(null);
        VowelsAndConsonants.dozy_main(null);
        WhileTest.dozy_main(null);
    }
}
