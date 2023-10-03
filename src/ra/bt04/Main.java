package ra.bt04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Rekkei Academy để nông dân biết code";

        List<String> stringList = new ArrayList<>();

        String[] str = input.split(" ");
        for (String word : str) {
            stringList.add(word);
        }


        for (String text : stringList) {
            if (text.length() > 3) {
                System.out.println(text);
            }
        }
    }
}
