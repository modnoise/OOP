package com.company;

import java.util.Arrays;

/**
 * C3 = 2, String;
 * C17 = 9: Задано текст та масив слів. Підрахувати у скількох реченнях зустрічається кожне слово масиву.
 */

public class Main {
    public static void main(String[] args) {
        String[] words = {"Артем", "Фермер", "ООП"};
        String Text = "Артем Дромашко - місцевий бандит, фермер Артем. З самого дитинства любив ооп, тому що його батько фермер" +
                " і він також фермер. В дитинстві він також хотів стати фермером, але ооп йому подобалось більше. Артем - зразок справжнього чоловіка.";
        String[] splitText = Text.split("\\. ?");
        System.out.println(Arrays.toString(splitText));
        int k;
        for (String word : words) {
            k = 0;
            for (String sentence : splitText) {
                String[] temp = sentence.split(" ");
                for (String each : temp) {
                    if (word.equalsIgnoreCase(each)) {
                        k++;
                        break;
                    }
                }
            }
            System.out.println("Слово " + word + " зустрічається в " + (int) k + " реченнях");
        }
//        public static boolean containsAllWords(String Text, String words) {
//            for (String k : words);
//                if (!word.contains(k)){return false;}
//            return true;
//        }
    }
}
