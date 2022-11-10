package ru.kharina.study.task8;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,3,3,4};
        int[] b = new int[]{0,1,1,2,2};

        int[] r = Task.method(a,b);
        String res = "";
        for (int i=0; i<r.length; i++)
            res +=  r[i];
        System.out.println(res);
    }
    private static int[] method(int a[], int b[]) {
        int a_size = a.length;
        int b_size = b.length;
        int[] result = new int[a_size + b_size];
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        while (i < a_size && j < b_size) {
            System.out.println(String.format("%d %d",i,j));
            if (a[i] <= b[j]) {
                m = a[i];
                i ++;
            } else {
                m = b[j];
                j++;
            }
            result[k] = m;
            System.out.println(String.format("r: %d",m));
            k++;
        }
        if (i < a_size) {
            System.arraycopy(a, i, result, k, (a.length - i));
        }
        if (j < b_size) {
            System.arraycopy(b, j, result, k, (b.length - j));
        }
        return result;
    }
}
