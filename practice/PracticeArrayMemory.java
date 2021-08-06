package practice;

public class PracticeArrayMemory {
    public static void main(String[] args) {
        int[] data1 = { 20, 40, 50, 10 };
        for (int i : data1)
            System.out.println(i);
        System.out.println("");
        int[] data2 = data1;
        for (int i : data2)
            System.out.println(i);
        System.out.println("");
        data1 = null;
        // for (int i : data1)
        // System.out.println(i);
        for (int i : data2)
            System.out.println(i);
        System.out.println("");

        // int[][] data3 = { [10, 20],[10,20] };
    }
}
