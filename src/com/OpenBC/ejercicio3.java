package com.OpenBC;

public class ejercicio3 {
    public static void main(String[] args) {
        String[] a = new String[]{"C","U","M","P","L","I","D","O"};
        System.out.println(concatenar(a));
    }

    public static String concatenar(String[] a) {
        String c="";
        for (String b :a) {
            c = c + b;
        }
        return c;
    }
}
