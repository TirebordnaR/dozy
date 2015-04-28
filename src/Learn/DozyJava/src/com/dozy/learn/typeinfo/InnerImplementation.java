//: typeinfo/InnerImplementation.java
package com.dozy.learn.typeinfo;
// Private inner classes can't hide from reflection.
import com.dozy.learn.typeinfo.interfacea.*;
import static net.mindview.util.Print.*;

class InnerA {
    private static class C implements A {
        public void f() {
            print("public C.f()");
        }

        @SuppressWarnings("unused")
        public void g() {
            print("public C.g()");
        }

        @SuppressWarnings("unused")
        void u() {
            print("package C.u()");
        }

        @SuppressWarnings("unused")
        protected void v() {
            print("protected C.v()");
        }

        @SuppressWarnings("unused")
        private void w() {
            print("private C.w()");
        }
    }

    public static A makeA() {
        return new C();
    }
}

public class InnerImplementation {
    public static void main(String[] args) throws Exception {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the private class:
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
} /* Output:
public C.f()
InnerA$C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
