package practice.simplecalc;

class Calc {
    public static void main(String[] args) {
        Calc calc1 = new Calc();
        calc1.plus(10, 5);
        calc1.minus(10, 5);
    }

    void plus(int val1, int val2) {
        System.out.println(val1 + val2);
    }

    void minus(int val1, int val2) {
        System.out.println(val1 - val2);
    }
}
