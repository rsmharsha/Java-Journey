package differentpackage;

import mypackage.AccessModifiersDemo;

public class SubClass extends AccessModifiersDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();

        System.out.println(obj.publicVar);      // ✅ allowed
        System.out.println(obj.protectedVar);   // ✅ allowed (via inheritance)
        // System.out.println(obj.defaultVar);  // ❌ not allowed
        // System.out.println(obj.privateVar);  // ❌ not allowed
    }
}
