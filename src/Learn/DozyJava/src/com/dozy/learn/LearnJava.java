package com.dozy.learn;

import com.dozy.learn.object.*;
import com.dozy.learn.operators.*;
import com.dozy.learn.control.*;
import com.dozy.learn.initialization.*;
import com.dozy.learn.access.*;
import com.dozy.learn.reusing.*;
import com.dozy.learn.polymorphism.*;
import com.dozy.learn.polymorphism.music.Music;
import com.dozy.learn.polymorphism.music.Music2;
import com.dozy.learn.polymorphism.music3.Music3;
import com.dozy.learn.interfaces.*;
import com.dozy.learn.interfaces.classprocessor.Apply;
import com.dozy.learn.interfaces.interfaceprocessor.*;
import com.dozy.learn.interfaces.music4.Music4;
import com.dozy.learn.interfaces.music5.Music5;
import com.dozy.learn.interfaces.nesting.NestingInterfaces;

public class LearnJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hey java, you're good. 才怪咧！");

        int i = 8;
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
        case 5:
            dozyAccess();
            break;
        case 6:
            dozyReusing();
            break;
        case 7:
            dozyPolymorphism();
            break;
        case 8:
            dozyInterfaces();
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

    private static void dozyAccess() {
        // Cake.main(null); // The type Cake is not visible
        ChocolateChip.main(null);
        ChocolateChip2.main(null);
        Dinner.main(null);
        FullQualification.main(null);
        IceCream.main(null);
        ImportedMyClass.main(null);
        LibTest.main(null);
        PrintTest.main(null);
        QualifiedMyClass.main(null);
        SingleImport.main(null);
    }

    private static void dozyReusing() {
        Bath.main(null);
        Beetle.main(null);
        BlankFinal.main(null);
        CADSystem.main(null);
        Car.main(null);
        Cartoon.main(null);
        Chess.main(null);
        Detergent.main(null);
        FinalArguments.main(null);
        FinalData.main(null);
        FinalOverridingIllusion.main(null);
        Hide.main(null);
        Jurassic.main(null);
        Orc.main(null);
        PlaceSetting.main(null);
        SpaceShip.main(null);
        SpaceShipDelegation.main(null);
        SprinklerSystem.main(null);
        Wind.main(null);
    }

    private static void dozyPolymorphism() {
        CovariantReturn.main(null);
        FieldAccess.main(null);
        Frog.main(null);
        PolyConstructors.main(null);
        PrivateOverride.main(null);
        ReferenceCounting.main(null);
        RTTI.main(null);
        Sandwich.main(null);
        Shapes.main(null);
        StaticPolymorphism.main(null);
        Transmogrify.main(null);
        Music.main(null);
        Music2.main(null);
        Music3.main(null);
    }

    private static void dozyInterfaces() {
        AdaptedRandomDoubles.main(null);
        Adventure.main(null);
        Factories.main(null);
        Games.main(null);
        HorrorShow.main(null);
        RandomDoubles.main(null);
        RandomWords.main(null);
        TestRandVals.main(null);
        Apply.main(null);
        FilterProcessor.main(null);
        StringProcessor.main(null);
        Music4.main(null);
        Music5.main(null);
        NestingInterfaces.main(null);
    }
}
