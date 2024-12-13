public class InterMan implements InnerInterMan {
    public static void main(String[] args) {
        InnerInterMan m = new InterMan();
        InnerInterMan.m3();
    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub
        System.out.println("abstract method");
    }
}

interface InnerInterMan {

    int x = 10;

    void m1();

    // void m2(){
    // System.out.println("hello");
    // }

    static void m3() {
        System.out.println("static method");
    }

}
