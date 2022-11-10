package ru.kharina.study.task9;

public class Task {
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич" };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(Task.method(roles, textLines));
    }
    private static String method(String[] roles, String[] textLines) {
        String result = "";
        for (String role : roles) {
            result += role + ":\n";
            for (int i=1; i<=textLines.length; i++) {
                if (textLines[i-1].startsWith(role + ":")) {
                    result += i + ") " + textLines[i-1].substring(role.length() + 1) + "\n";
                }
            }
            result += "\n";
        }
        return result;
    }
}

