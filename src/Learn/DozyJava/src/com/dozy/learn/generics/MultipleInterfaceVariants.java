//: generics/MultipleInterfaceVariants.java
package com.dozy.learn.generics;

// {CompileTimeError} (Won't compile)

interface Payable<T> {
}

class Employee implements Payable<Employee> {
}

// err class Hourly extends Employee implements Payable<Hourly> {
// } // /:~
