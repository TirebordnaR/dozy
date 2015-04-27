package com.dozy.learn;

import com.dozy.learn.object.*;
import com.dozy.learn.operators.*;
import com.dozy.learn.control.*;
import com.dozy.learn.initialization.*;

public class LearnJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hey java, you're good. 才怪咧！");

        int i = 4;
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
        case 4:
            dozyInitialization();
            break;
        default:
            break;
        }
    }

    private static void dozyObject() {
        HelloDate.main(null);
        ShowProperties.main(null);
    }

    private static void dozyOperators() {
        Assignment.main(null);
        AutoInc.main(null);
        BitManipulation.main(null);
        Bool.main(null);
        Casting.main(null);
        CastingNumbers.main(null);
        EqualsMethod.main(null);
        EqualsMethod2.main(null);
        Equivalence.main(null);
        Exponents.main(null);
        HelloDate.main(null);
        Literals.main(null);
        MathOps.main(null);
        Overflow.main(null);
        PassObject.main(null);
        Precedence.main(null);
        RoundingNumbers.main(null);
        ShortCircuit.main(null);
        StringOperators.main(null);
        TernaryIfElse.main(null);
        URShift.main(null);
    }

    private static void dozyControl() {
        BreakAndContinue.main(null);
        CommaOperator.main(null);
        ForEachFloat.main(null);
        ForEachInt.main(null);
        ForEachString.main(null);
        IfElse.main(null);
        IfElse2.main(null);
        LabeledFor.main(null);
        LabeledWhile.main(null);
        ListCharacters.main(null);
        VowelsAndConsonants.main(null);
        WhileTest.main(null);
    }
    
    private static void dozyInitialization() {
        ArrayClassObj.main(null);
        ArrayInit.main(null);
        ArrayNew.main(null);
        ArraysOfPrimitives.main(null);
        AutoboxingVarargs.main(null);
        BananaPeel.main(null);
        Burrito.main(null);
        DefaultConstructor.main(null);
        Demotion.main(null);
        DynamicArray.main(null);
        EnumOrder.main(null);
        ExplicitStatic.main(null);
        Flower.main(null);
        InitialValues.main(null);
        Leaf.main(null);
        Mugs.main(null);
        NewVarArgs.main(null);
        NoSynthesis.main(null);
        OptionalTrailingArguments.main(null);
        OrderOfInitialization.main(null);
        Overloading.main(null);
        OverloadingOrder.main(null);
        OverloadingVarargs.main(null);
        OverloadingVarargs3.main(null);
        PassingThis.main(null);
        PrimitiveOverloading.main(null);
        SimpleConstructor.main(null);
        SimpleConstructor2.main(null);
        SimpleEnumUse.main(null);
        StaticInitialization.main(null);
        TerminationCondition.main(null);
        VarArgs.main(null);
        VarargType.main(null);
    }
}
