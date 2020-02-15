package week1.Q1;

public interface state {
    state transition(int input);

    String toString();
    //void peekNext(int input);

    default void peekNext(int input) {
        System.out.println("PEEK\ncurrent state: " + this +
                "\nnext state: " + transition(input)
                +"\nPEEK END");
    }

}
