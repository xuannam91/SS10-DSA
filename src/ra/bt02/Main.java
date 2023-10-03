package ra.bt02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add((int) Math.floor(Math.random()*100));
        }
        System.out.println(lists);
        List<Integer> reversedList = new ArrayList<>();
        for (int i = lists.size()-1; i >= 0 ; i--) {
            reversedList.add(lists.get(i));
        }
        System.out.println("Ban đầu"+lists);
        System.out.println("Đảo ngược"+reversedList);
    }
}
