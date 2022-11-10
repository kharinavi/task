package ru.kharina.study.task3;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(34, 5));
    }
    private static int method(int a, int x) {
        return a ^ (1 << (x-1));
    }
}
