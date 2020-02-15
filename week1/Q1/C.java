package week1.Q1;

public class C implements state {

    private static final C c = new C();

    private C() {
    }

    @Override
    public state transition(int input) {
        System.out.println("current: " + this);
        System.out.println("new: " + c);
        return c;
    }

    public static C getC() {
        return c;
    }

    @Override
    public String toString() {
        return "C";
    }
}
