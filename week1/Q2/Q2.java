package week1.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q2 {

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.populate(3, "");
        List<String> filtered =
                q2.applyFilter(list, q2.DiscardConsecutiveOnes());
        print(filtered);
        print(list);
    }

    Predicate<String> DiscardConsecutiveOnes() {
        return str -> !str.contains("11");
    }

    List<String> applyFilter(List<String> list, Predicate<String> filter) {
        return list.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    static void print(List<String> l) {
        l.forEach(System.out::println);
    }

    void populate(int n, String str) {
        if (str.length() == n) {
            list.add(str);
        } else {
            populate(n, str + "0");
            populate(n, str + "1");
        }
    }

}
