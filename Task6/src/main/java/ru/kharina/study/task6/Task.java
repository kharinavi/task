package ru.kharina.study.task6;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method("Madam, I'm Adam!"));
    }

    private static boolean method(String s) {
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        return (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()));
    }
}
