//: enumerated/Competitor.java
// Switching one enum on another.
package com.dozy.learn.enumerated;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
} // /:~
