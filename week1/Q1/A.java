package week1.Q1;

public class A implements state{

    private static final A a = new A();
    private A() { }

    public static A getA() {
        return a;
    }

    @Override
    public state transition(int input) {
        System.out.println("current: " + this);
        state result = input == 1 ? getA() : B.getB();
        System.out.println("new: " + result);
        return result;
    }

    @Override
    public String toString() {
        return "A";
    }
}
