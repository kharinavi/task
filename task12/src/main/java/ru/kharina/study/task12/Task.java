package ru.kharina.study.task12;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        SpamAnalyzer san = new SpamAnalyzer(new String[]{"Реклама", "Спам"});
        Task.method(san, "11111111 Реклама 3333333333 23444242 45908342");
        NegativeAnalyzer neg = new NegativeAnalyzer();
        Task.method(neg, "11111111 :( 3333333333 :| 23444242 45908342");
        TooLongAnalyzer toolong = new TooLongAnalyzer(20);
        Task.method(toolong, "11111111 :( 3333333333 :| 23444242 45908342");
        Task.method(san, "11111111 :( 3333333333 :| 23444242 45908342");
        Task.method(neg, "11111111  3333333333  23444242 45908342");
    }

    public static void method(TextAnalyzer analyzer, String text) {
        System.out.println(analyzer.processText(text));
    }
}
