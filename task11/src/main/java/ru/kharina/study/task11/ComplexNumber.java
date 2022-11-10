package ru.kharina.study.task11;

import java.util.Objects;

public class ComplexNumber {
    private int re;
    private int im;

    public ComplexNumber(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return re == that.re && im == that.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
