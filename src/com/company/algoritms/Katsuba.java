package com.company.algoritms;

import java.math.BigDecimal;

public class Katsuba {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("3141592653589793238462643383279502884197169399375105820974944592");
        BigDecimal y = new BigDecimal("2718281828459045235360287471352662497757247093699959574966967627");
        System.out.println(x.multiply(y));
//        System.out.println(katsuba(x, y));
    }

    static BigDecimal katsuba(BigDecimal x, BigDecimal y) {
        int n = x.toString().length();
        if (n == 2) {
            return x.multiply(y);
        }
        int n1 = n/2;
        BigDecimal a = new BigDecimal(x.toString().substring(0, n1));
        BigDecimal b = new BigDecimal(x.toString().substring(n1));
        BigDecimal c = new BigDecimal(y.toString().substring(0, n1));
        BigDecimal d = new BigDecimal(y.toString().substring(n1));

        BigDecimal var1 = katsuba(a, c);
        BigDecimal var2 = katsuba(b, d);
        BigDecimal var3 = (a.add(b)).multiply(c.add(d)).subtract(var1).subtract(var2);
        return var1.multiply(BigDecimal.valueOf(10).pow(n))
                .add(var3.multiply(BigDecimal.valueOf(10).pow(n1))).add(var2);
    }
}
