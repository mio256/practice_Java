package Calcapp.main;

import Calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int total = CalcLogic.add(a, b);
        int delta = CalcLogic.sub(a, b);
        System.out.println("add:" + total);
        System.out.println("sub:" + delta);
    }
}
