package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> testString = new ArrayList<>();
        testString.add("a a b c d");
        testString.add("b a d");

        BagOfWords bagOfWords =  new BagOfWords(testString);
        System.out.println(bagOfWords.transform(testString.getFirst()));
        System.out.println(bagOfWords.transform(testString.getLast()));

        new TestBuilder().describe().expect().equal().to();
    }
}