package ru.kharina.study.task11;

public class Task {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, -1);
        ComplexNumber b = new ComplexNumber(1, 1);

        System.out.println(a.hashCode() + b.hashCode());
    }
}
