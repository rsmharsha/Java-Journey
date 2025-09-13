package samepackage;

import mypackage.AccessModifiersDemo;

public class TestSamePackage {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        System.out.println(obj.publicVar);      // ✅ allowed
        System.out.println(obj.protectedVar);   // ✅ allowed (same package)
        System.out.println(obj.defaultVar);     // ✅ allowed (package-private)
        // System.out.println(obj.privateVar);  // ❌ not allowed (private)
    }
}
