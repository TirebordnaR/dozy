//: typeinfo/packageaccess/HiddenC.java
package com.dozy.learn.typeinfo.packageaccess;

import com.dozy.learn.typeinfo.interfacea.*;
import static net.mindview.util.Print.*;

class C implements A {
    public void f() {
        print("public C.f()");
    }

    public void g() {
        print("public C.g()");
    }

    void u() {
        print("package C.u()");
    }

    protected void v() {
        print("protected C.v()");
    }

    @SuppressWarnings("unused")
    private void w() {
        print("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
} // /:~
