package org.example;

import java.util.regex.Pattern;


public class NumberToLetterConverter {

    public static void main(String[] args) {
        String inputText = "Hello, I have 3 apples and 1 banana. Let's meet at building 7.";
        System.out.println(replaceNumbersWithLetters(inputText));
    }

    public static String replaceNumbersWithLetters(String text) {
        Pattern pattern = Pattern.compile("\\b[0-9]\\b");
        return pattern.matcher(text).replaceAll(match -> {
            int number = Integer.parseInt(match.group());
            char letter = (char) ('A' + number - 1);
            return String.valueOf(letter);
        });
    }
}
