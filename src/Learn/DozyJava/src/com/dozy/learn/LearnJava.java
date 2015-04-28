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
import com.dozy.learn.innerclasses.*;
import com.dozy.learn.holding.*;
import com.dozy.learn.exceptions.*;
import com.dozy.learn.strings.*;
import com.dozy.learn.typeinfo.*;
import com.dozy.learn.typeinfo.pets.*;
import com.dozy.learn.typeinfo.toys.*;
import com.dozy.learn.generics.*;
import com.dozy.learn.generics.coffee.CoffeeGenerator;
import com.dozy.learn.generics.decorator.Decoration;
import com.dozy.learn.arrays.*;
import com.dozy.learn.containers.*;
import com.dozy.learn.io.*;
import com.dozy.learn.enumerated.*;
import com.dozy.learn.enumerated.cartoons.EnumImplementation;
import com.dozy.learn.enumerated.menu.*;
import com.dozy.learn.concurrency.*;

public class LearnJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hey java, you're good. 才怪咧！");

        int i = 16;
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
        case 9:
            dozyInnerclasses();
            break;
        case 10:
            dozyHolding();
            break;
        case 11:
            dozyExceptions();
            break;
        case 12:
            dozyStrings();
            break;
        case 13:
            dozyTypeinfo();
            break;
        case 14:
            dozyGenerics();
            break;
        case 15:
            dozyArray();
            break;
        case 16:
            dozyContainers();
            break;
        case 17:
            dozyIo();
            break;
        case 18:
            dozyEnumerated();
            break;
        case 19:
            dozyConcurrency();
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
        com.dozy.learn.initialization.Burrito.main(null);
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
        com.dozy.learn.access.IceCream.main(null);
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
        com.dozy.learn.reusing.SpaceShip.main(null);
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
        com.dozy.learn.polymorphism.Shapes.main(null);
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

    private static void dozyInnerclasses() {
        AnonymousConstructor.main(null);
        BigEgg.main(null);
        BigEgg2.main(null);
        Callbacks.main(null);
        ClassInInterface.Test.main(null);
        DotNew.main(null);
        DotThis.main(null);
        Factories.main(null);
        Games.main(null);
        GreenhouseController.main(null);
        InheritInner.main(null);
        LocalInnerClass.main(null);
        MultiImplementation.main(null);
        MultiInterfaces.main(null);
        MultiNestingAccess.main(null);
        Parcel1.main(null);
        Parcel10.main(null);
        Parcel11.main(null);
        Parcel2.main(null);
        Parcel3.main(null);
        Parcel5.main(null);
        Parcel6.main(null);
        Parcel7.main(null);
        Parcel7b.main(null);
        Parcel8.main(null);
        Parcel9.main(null);
        Sequence.main(null);
        TestBed.Tester.main(null);
        TestParcel.main(null);
    }

    private static void dozyHolding() {
        AdapterMethodIdiom.main(null);
        AddingGroups.main(null);
        ApplesAndOrangesWithGenerics.main(null);
        ApplesAndOrangesWithoutGenerics.main(null);
        ArrayIsNotIterable.main(null);
        AsListInference.main(null);
        CollectionSequence.main(null);
        ContainerMethods.main(null);
        CrossContainerIteration.main(null);
        EnvironmentVariables.main(null);
        ForEachCollections.main(null);
        GenericsAndUpcasting.main(null);
        InterfaceVsIterator.main(null);
        IterableClass.main(null);
        LinkedListFeatures.main(null);
        ListFeatures.main(null);
        ListIteration.main(null);
        MapOfList.main(null);
        ModifyingArraysAsList.main(null);
        MultiIterableClass.main(null);
        NonCollectionSequence.main(null);
        PetMap.main(null);
        PrintingContainers.main(null);
        PriorityQueueDemo.main(null);
        QueueDemo.main(null);
        SetOfInteger.main(null);
        SetOperations.main(null);
        SimpleCollection.main(null);
        SimpleIteration.main(null);
        SortedSetOfInteger.main(null);
        StackCollision.main(null);
        StackTest.main(null);
        Statistics.main(null);
        UniqueWords.main(null);
        UniqueWordsAlphabetic.main(null);
    }

    private static void dozyExceptions() {
        AlwaysFinally.main(null);
        Cleanup.main(null);
        CleanupIdiom.main(null);
        DynamicFields.main(null);
        ExceptionMethods.main(null);
        ExceptionSilencer.main(null);
        ExtraFeatures.main(null);
        FinallyWorks.main(null);
        FullConstructors.main(null);
        Human.main(null);
        InheritingExceptions.main(null);
        LoggingExceptions.main(null);
        LoggingExceptions2.main(null);
        LostMessage.main(null);
        try {
            MainException.main(null);
        } catch (Exception e) {
            System.out.println("MainException");
        }
        MultipleReturns.main(null);
        try {
            NeverCaught.main(null);
        } catch (Exception e) {
            System.out.println("NeverCaught");
        }
        OnOffSwitch.main(null);
        Rethrowing.main(null);
        RethrowNew.main(null);
        StormyInning.main(null);
        TurnOffChecking.main(null);
        WhoCalled.main(null);
        WithFinally.main(null);
    }

    private static void dozyStrings() {
        ArrayListDisplay.main(null);
        BetterRead.main(null);
        Concatenation.main(null);
        Conversion.main(null);
        DatabaseException.main(null);
        Finding.main(null);
        Groups.main(null);
        Immutable.main(null);
        IntegerMatch.main(null);
        try {
            JGrep.main(null);
        } catch (Exception e) {
        }
        Receipt.main(null);
        ReFlags.main(null);
        Replacing.main(null);
        ReplacingStringTokenizer.main(null);
        try {
            Resetting.main(null);
        } catch (Exception e) {
        }
        Rudolph.main(null);
        ScannerDelimiter.main(null);
        SimpleFormat.main(null);
        try {
            SimpleRead.main(null);
        } catch (Exception e) {
        }
        SplitDemo.main(null);
        Splitting.main(null);
        StartEnd.main(null);
        TestRegularExpression.main(null);
        try {
            TheReplacements.main(null);
        } catch (Exception e) {
        }
        ThreatAnalyzer.main(null);
        Turtle.main(null);
        UsingStringBuilder.main(null);
    }

    private static void dozyTypeinfo() {
        try {
            AnonymousImplementation.main(null);
        } catch (Exception e) {
        }
        BoundedClassReferences.main(null);
        ClassCasts.main(null);
        try {
            ClassInitialization.main(null);
        } catch (Exception e) {
        }
        FamilyVsExactType.main(null);
        FilledList.main(null);
        GenericClassReferences.main(null);
        try {
            HiddenImplementation.main(null);
            InnerImplementation.main(null);
            ModifyingPrivateFields.main(null);
        } catch (Exception e) {
        }
        InterfaceViolation.main(null);
        NullRobot.main(null);
        PetCount.main(null);
        PetCount2.main(null);
        PetCount3.main(null);
        PetCount4.main(null);
        RegisteredFactories.main(null);
        SelectingMethods.main(null);
        com.dozy.learn.typeinfo.Shapes.main(null);
        ShowMethods.main(null);
        SimpleDynamicProxy.main(null);
        SimpleProxyDemo.main(null);
        SnowRemovalRobot.main(null);
        Staff.main(null);
        SweetShop.main(null);
        WildcardClassReferences.main(null);
        LiteralPetCreator.main(null);
        try {
            GenericToyTest.main(null);
        } catch (Exception e) {
        }
        ToyTest.main(null);
    }

    private static void dozyGenerics() {
        Apply.main(null);
        ArrayMaker.main(null);
        ArrayOfGeneric.main(null);
        BankTeller.main(null);
        BasicBounds.main(null);
        BasicGeneratorDemo.main(null);
        CaptureConversion.main(null);
        CheckedList.main(null);
        ClassTypeCapture.main(null);
        CompilerIntelligence.main(null);
        CovariantArrays.main(null);
        CreatorGeneric.main(null);
        CRGWithBasicHolder.main(null);
        DogsAndRobots.main(null);
        DynamicProxyMixin.main(null);
        EpicBattle.main(null);
        ErasedTypeEquivalence.main(null);
        ErasureAndInheritance.main(null);
        ExplicitTypeSpecification.main(null);
        FactoryConstraint.main(null);
        Fibonacci.main(null);
        FillTest.main(null);
        Fill2Test.main(null);
        FilledListMaker.main(null);
        Functional.main(null);
        Generators.main(null);
        GenericArray.main(null);
        GenericArray2.main(null);
        GenericArrayWithTypeToken.main(null);
        GenericCast.main(null);
        GenericHolder.main(null);
        GenericMethods.main(null);
        GenericReading.main(null);
        GenericsAndCovariance.main(null);
        GenericVarargs.main(null);
        GenericWriting.main(null);
        Holder.main(null);
        Holder2.main(null);
        Holder3.main(null);
        InheritBounds.main(null);
        InstantiateGenericType.main(null);
        IterableFibonacci.main(null);
        LatentReflection.main(null);
        LimitsOfInference.main(null);
        LinkedStack.main(null);
        ListMaker.main(null);
        ListOfInt.main(null);
        LostInformation.main(null);
        Mixins.main(null);
        OrdinaryArguments.main(null);
        PlainGenericInheritance.main(null);
        PrimitiveGenericTest.main(null);
        RandomList.main(null);
        SelfBounding.main(null);
        SelfBoundingMethods.main(null);
        SimpleDogsAndRobots.main(null);
        SimpleHolder.main(null);
        SimplerPets.main(null);
        Store.main(null);
        ThrowGenericException.main(null);
        TupleList.main(null);
        TupleTest.main(null);
        TupleTest2.main(null);
        UnboundedWildcards1.main(null);
        UnboundedWildcards2.main(null);
        Unconstrained.main(null);
        WatercolorSets.main(null);
        Wildcards.main(null);
        CoffeeGenerator.main(null);
        Decoration.main(null);
    }

    private static void dozyArray() {
        AlphabeticSearch.main(null);
        ArrayOfGenerics.main(null);
        ArrayOptions.main(null);
        ArraySearching.main(null);
        AssemblingMultidimensionalArrays.main(null);
        AutoboxingArrays.main(null);
        ComparatorTest.main(null);
        ComparingArrays.main(null);
        CompType.main(null);
        ContainerComparison.main(null);
        CopyingArrays.main(null);
        FillingArrays.main(null);
        GeneratorsTest.main(null);
        com.dozy.learn.arrays.IceCream.main(null);
        MultidimensionalObjectArrays.main(null);
        MultidimensionalPrimitiveArray.main(null);
        MultiDimWrapperArray.main(null);
        ParameterizedArrayType.main(null);
        PrimitiveConversionDemonstration.main(null);
        RaggedArray.main(null);
        RandomGeneratorsTest.main(null);
        Reverse.main(null);
        StringSorting.main(null);
        TestArrayGeneration.main(null);
        TestGenerated.main(null);
        ThreeDWithNew.main(null);
    }

    private static void dozyContainers() {
        AssociativeArray.main(null);
        Bits.main(null);
        CanonicalMapping.main(null);
        CollectionDataGeneration.main(null);
        CollectionDataTest.main(null);
        CollectionMethods.main(null);
        CountedString.main(null);
        DequeTest.main(null);
        Enumerations.main(null);
        FailFast.main(null);
        FillingLists.main(null);
        IndividualTest.main(null);
        LinkedHashMapDemo.main(null);
        ListPerformance.main(null);
        Lists.main(null);
        ListSortSearch.main(null);
        MapDataTest.main(null);
        MapPerformance.main(null);
        Maps.main(null);
        QueueBehavior.main(null);
        ReadOnly.main(null);
        References.main(null);
        SetPerformance.main(null);
        SimpleHashMap.main(null);
        SlowMap.main(null);
        SortedMapDemo.main(null);
        SortedSetDemo.main(null);
        try {
            SpringDetector.main(null);
            SpringDetector2.main(null);
        } catch (Exception e) {
        }
        Stacks.main(null);
        StringHashCode.main(null);
        Synchronization.main(null);
        ToDoList.main(null);
        TypesForSets.main(null);
        Unsupported.main(null);
        Utilities.main(null);
    }

    private static void dozyIo() {
        AvailableCharSets.main(null);
        // BasicFileOutput.main(null);
        // Blip3.main(null);
        // Blips.main(null);
        // BufferedInputFile.main(null);
        // BufferToText.main(null);
        ChangeSystemOut.main(null);
        // ChannelCopy.main(null);
        DirectoryDemo.main(null);
        // DirList.main(null);
        // DirList2.main(null);
        // DirList3.main(null);
        Endians.main(null);
        // FileLocking.main(null);
        // FileOutputShortcut.main(null);
        // FormattedMemoryInput.main(null);
        // FreezeAlien.main(null);
        // GetChannel.main(null);
        GetData.main(null);
        // GZIPcompress.main(null);
        IntBufferDemo.main(null);
        // Logon.main(null);
        // MakeDirectories.main(null);
        MappedIO.main(null);
        // MemoryInput.main(null);
        // MyWorld.main(null);
        // OSExecuteDemo.main(null);
        // PreferencesDemo.main(null);
        // RecoverCADState.main(null);
        // Redirecting.main(null);
        // SerialCtl.main(null);
        // StoreCADState.main(null);
        // StoringAndRecoveringData.main(null);
        // TestEOF.main(null);
        // TransferTo.main(null);
        UsingBuffers.main(null);
        // UsingRandomAccessFile.main(null);
        ViewBuffers.main(null);
        // Worm.main(null);
        // ZipCompress.main(null);
    }

    private static void dozyEnumerated() {
        BigEnumSet.main(null);
        com.dozy.learn.enumerated.Burrito.main(null);
        CarWash.main(null);
        ConstantSpecificMethod.main(null);
        EnumClass.main(null);
        //EnumMaps.main(null);
        //EnumSets.main(null);
        NonEnum.main(null);
        OverrideConstantSpecific.main(null);
        OzWitch.main(null);
        PostOffice.main(null);
        RandomTest.main(null);
        //Reflection.main(null);
        RoShamBo1.main(null);
        RoShamBo2.main(null);
        RoShamBo3.main(null);
        RoShamBo4.main(null);
        RoShamBo5.main(null);
        RoShamBo6.main(null);
        SecurityCategory.main(null);
        com.dozy.learn.enumerated.SpaceShip.main(null);
        TrafficLight.main(null);
        UpcastEnum.main(null);
        //VendingMachine.main(null);
        EnumImplementation.main(null);
        //Meal.main(null);
        Meal2.main(null);
        TypeOfFood.main(null);
        //NotClasses.main(null);
    }

    private static void dozyConcurrency() {
        ActiveObjectDemo.main(null);
        AtomicIntegerTest.main(null);
        AtomicityTest.main(null);
        AttemptLocking.main(null);
        //BankTellerSimulation.main(null);
        BasicThreads.main(null);
        CachedThreadPool.main(null);
        CallableDemo.main(null);
        CaptureUncaughtException.main(null);
        //CarBuilder.main(null);
        //CountDownLatchDemo.main(null);
        CriticalSection.main(null);
        //DaemonFromFactory.main(null);
        //Daemons.main(null);
        //DaemonsDontRunFinally.main(null);
        //DeadlockingDiningPhilosophers.main(null);
        DelayQueueDemo.main(null);
        EvenGenerator.main(null);
        ExceptionThread.main(null);
        //ExchangerDemo.main(null);
        //ExplicitCriticalSection.main(null);
        //FastSimulation.main(null);
        //FixedDiningPhilosophers.main(null);
        FixedThreadPool.main(null);
        GreenhouseScheduler.main(null);
        HorseRace.main(null);
        //Interrupting.main(null);
        //Interrupting2.main(null);
        //InterruptingIdiom.main(null);
        Joining.main(null);
        ListComparisons.main(null);
        MainThread.main(null);
        MapComparisons.main(null);
        MoreBasicThreads.main(null);
        //MultiLock.main(null);
        NaiveExceptionHandling.main(null);
        //NIOInterruption.main(null);
        //NotifyVsNotifyAll.main(null);
        //OrnamentalGarden.main(null);
        //PipedIO.main(null);
        //PriorityBlockingQueueDemo.main(null);
        //ReaderWriterList.main(null);
        Restaurant.main(null);
        SelfManaged.main(null);
        //SemaphoreDemo.main(null);
        //SerialNumberChecker.main(null);
        SettingDefaultHandler.main(null);
        //SimpleDaemons.main(null);
        SimpleMicroBenchmark.main(null);
        SimplePriorities.main(null);
        SimpleThread.main(null);
        SingleThreadExecutor.main(null);
        SleepingTask.main(null);
        SynchronizationComparisons.main(null);
        SyncObject.main(null);
        //ThreadLocalVariableHolder.main(null);
        ThreadVariations.main(null);
        //ToastOMatic.main(null);
        //RestaurantWithQueues.main(null);
        //WaxOMatic.main(null);
        //WaxOMatic2.main(null);
        //Atomicity.main(null);
    }
}
