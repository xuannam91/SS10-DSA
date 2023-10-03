package ra.bt01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           lists.add((int) Math.floor(Math.random()*100));
        }
        System.out.println(lists);
        int maxElement = Collections.max(lists);
        System.out.println("Giá trị lớn nhất: " + maxElement);
        int minElement = Collections.min(lists);
        System.out.println("Giá trị nhỏ nhất: " + minElement);
    }

}
