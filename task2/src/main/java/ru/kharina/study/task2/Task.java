package ru.kharina.study.task2;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(500));

    }
    private static int method(int a) {
        return (a/4 - a/100 + a/400);
    }
}
