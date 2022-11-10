package ru.kharina.study.task5;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(64));
    }
    private static boolean method(int a) {
        return (Integer.bitCount(a) == 1);
    }
}
