package com.edgebasis;

public class Main {

    public static void main(String[] args) {

        String a=   "11";
        String b = "1";
        int carryIn = 0;
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sum = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int ak = i < 0? 0 : (a.charAt(i--) - '0');
            int bk = j < 0? 0 : (b.charAt(j--) - '0');
            int carryOut = (ak & bk) | (ak & carryIn) | (bk & carryIn);
            sum.append((ak ^ bk ^ carryIn));
            carryIn = carryOut;
        }

        System.out.println(carryIn == 1? sum.append(carryIn).reverse().toString() : sum.reverse().toString());
    }
}
