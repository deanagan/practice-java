package com.vscode.demo;

public class ThreeWords {
    public boolean hasThreeWordsConsecutive(String input) {

        var splittedInput = input.split(" ");
        // val totalConsecutive = splittedInput.fold(0, {
        //     acc: Int, current: String -> acc + (if(current.all { it.isLetter() } || acc >= 3) 1 else -acc )
        // })

        // return totalConsecutive >= 3 ;
        return true;
    }

}
