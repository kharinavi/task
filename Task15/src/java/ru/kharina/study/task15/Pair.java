package ru.kharina.study.task15;

import java.util.Objects;

class Pair <T1, T2>{
    private Pair(T1 t1, T2 t2){
        first = t1;
        second = t2;
    }
    private T1 first;
    private T2 second;

    public static <T1, T2> Pair<T1, T2> of(T1 t1, T2 t2) {
        return new Pair(t1, t2);
    }
    public T1 getFirst() {
        return first;
    }
    public T2 getSecond() {
        return second;
    }
    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (Pair.class.isInstance(other)) {
            return Objects.equals(first, ((Pair<?,?>)other).first) &&
                    Objects.equals(second, ((Pair<?,?>)other).second);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getFirst()) ^ Objects.hashCode(this.getSecond());
    }
}
