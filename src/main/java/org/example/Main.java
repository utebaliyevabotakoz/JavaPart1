package org.example;

public class Main {
    public static void main(String[] args) {
        // переполнения при вычислениях
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int b = 5000;
        int c = 123;
        int min = Math.min(a, Math.min(b,c));
        System.out.println(min);
        int max = Math.max(a, Math.max(b,c));
        System.out.println(max);
        int d = a + b + c - min - max;
        System.out.println(d);

        //вычисления комбинаций типов данных (int и double)
        int intx=10;
        double doubley=20.123;
        System.out.println(intx+ doubley);

    }
}