public class Factorial extends Hello {

    // private Factorial() {
    // super();
    // }

    public static void main(String[] args) {
        Hello h = new Factorial();
        // h.m1();
        // Hello.m1();
    }

    @Override
    void m3() {
        // TODO Auto-generated method stub
        System.out.println("abstract method...");
    }

}

abstract class Hello {
    Hello() {
        System.out.println("Constructor of abstract class...");
    }

    static void m1() {
        System.out.println("Static method...");
    }

    void m2() {
        System.out.println("Default Method...");
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance Block...");
    }

    abstract void m3();
}