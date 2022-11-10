package ru.kharina.study.task4;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method('\\', 29));
    }
    private static char method(char c, int x) {
        return (char)((int)c + x);
    }
}
