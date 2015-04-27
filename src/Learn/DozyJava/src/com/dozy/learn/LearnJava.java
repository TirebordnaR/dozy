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
