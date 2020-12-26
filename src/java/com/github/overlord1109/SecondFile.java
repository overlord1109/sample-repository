package com.github.overlord1109;

public class SecondFile {

    //New method added
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println("Addition is: " +  add(1 + 2 + 3));
    }
}