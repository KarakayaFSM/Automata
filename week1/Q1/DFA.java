package week1.Q1;

public class DFA {

    public static void main(String[] args) {
        state initial = A.getA();
        state finalState = initial
                .transition(0)
                .transition(1)
                .transition(1);

        System.out.println("final state: " + finalState);

        finalState.peekNext(0);

    }

}
