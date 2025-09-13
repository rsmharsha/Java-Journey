package mypackage;



public class AccessModifiersDemo {

    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default (package-private) Variable";
    private String privateVar = "Private Variable";

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {   // package-private
        System.out.println("Default (package-private) method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Inside the same class → all accessible
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.privateVar);

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }
}
