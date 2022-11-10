package ru.kharina.study.task7;

import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        System.out.println(Task.method(5));
    }
    private static BigInteger method(int a) {
        if (a!=0 && a!=1) {
            return method(a-1).multiply(BigInteger.valueOf(a));
        } else {
            return BigInteger.valueOf(1);
        }
    }
}
