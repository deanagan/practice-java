package com.practice.demo;

import java.util.Arrays;

public class ThreeWords {
    private boolean isStringAllLetters(String word) {
        boolean isAllLetters = true;
        for (var ch : word.toCharArray()) {
            if (!Character.isLetter(ch)) {
                isAllLetters = false;
                break;
            }
        }
        return isAllLetters;
    }
    public boolean hasThreeWordsConsecutive(String input) {

        var splittedInput = input.split(" ");

        var longestConsecutive = Arrays.asList(splittedInput)
                                     .stream()
                                     .reduce(0,
                                        (total, word) -> total + ((isStringAllLetters(word) || total >= 3) ? 1 : -total),
                                        Integer::sum);


        return longestConsecutive >= 3 ;
    }

}
