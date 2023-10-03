package ra.bt03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        Collections.sort(numbers);
        System.out.println("sắp xếp tăng dần"+numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("sắp xếp giảm dần"+numbers);

    }
}
