package differentpackage;

import mypackage.AccessModifiersDemo;

public class TestDifferentPackage {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        System.out.println(obj.publicVar);      // ✅ allowed
        // System.out.println(obj.protectedVar);   // ❌ not allowed
        // System.out.println(obj.defaultVar);     // ❌ not allowed
        // System.out.println(obj.privateVar);     // ❌ not allowed
    }
}
