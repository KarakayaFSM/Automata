package week1.Q1;

public class B implements state {

    private static final B b = new B();

    private B() {
    }

    @Override
    public state transition(int input) {
        System.out.println("current: " + this);
        state result = input == 0 ? getB() : C.getC();
        System.out.println("new: " + result);
        return result;
    }

    public static B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "B";
    }
}
