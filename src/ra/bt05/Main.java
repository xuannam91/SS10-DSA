package ra.bt05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Rekkei Academy để nông dân biết code hi hi";

        List<String> stringList = new ArrayList<>();

        String[] str = input.split(" ");
        for (String word : str) {
            stringList.add(word);
        }
        List<String> shortestWords = new ArrayList<>();

        int minLength = stringList.get(0).length();
        for (String text : stringList) {
            int textLength = text.length();
            if (textLength < minLength) {
                minLength = textLength;
                shortestWords.clear();
                shortestWords.add(text);
            } else if (textLength == minLength) {
                shortestWords.add(text);
            }
        }

        System.out.println("Chuỗi ngắn nhất:");
        for (String word : shortestWords) {
            System.out.println(word);
        }
    }
}
