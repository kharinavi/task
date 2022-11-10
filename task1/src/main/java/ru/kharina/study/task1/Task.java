package ru.kharina.study.task1;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(true, true, false, false));
    }

    private static boolean method(boolean first, boolean second, boolean third, boolean forth) {
        return (first | second | third | forth) &&
                !(first & second & third & forth) &&
                !( first ^ second ^ third ^ forth);
    }
}
