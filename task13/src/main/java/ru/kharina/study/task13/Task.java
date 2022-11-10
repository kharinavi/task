package ru.kharina.study.task13;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(-4));
    }
    private static double method(int a) throws IllegalArgumentException{
        if (a >= 0)
            return Math.sqrt(a);
        else
            throw new IllegalArgumentException("Expected non-negative number, got " + a);
    }
}
