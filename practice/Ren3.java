package practice;

public class Ren3 {
    public static void main(String[] args) {
        int weight = 0;
        if (weight == 60)
            ;
        int age1 = 0;
        int age2 = 0;
        if ((age1 + age2) * 2 > 60)
            ;
        int age = 0;
        if (age % 2 == 1)
            ;
        String name = "NULL";
        if (name.equals("湊"))
            ;

        // C D E

        int isHungry = 0;
        String food = "apple";
        System.out.println("hello");
        if (isHungry == 0)
            System.out.println("I'm full");
        else {
            System.out.println("I'm hungry");
            System.out.println("I'll eat " + food);
            System.out.println("Thank you for the meal");
        }

        System.out.println("[menu] 1:search 2:register 3:delete 4:change >");
        // int selected = new java.util.Scanner(System.in).nextInt();
        int selected = 5;
        switch (selected) {
            case 1:
                System.out.println("search");
                break;
            case 2:
                System.out.println("register");
                break;
            case 3:
                System.out.println("delete");
                break;
            case 4:
                System.out.println("change");
                break;
            default:
                break;
        }

        // System.out.println("[Game of NumQuiz]");
        // int ans = new java.util.Random().nextInt(10);
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Type num 0-9");
        // int num = new java.util.Scanner(System.in).nextInt();
        // if (ans == num) {
        // System.out.println("Yes!");
        // break;
        // } else {
        // System.out.println("No");
        // }
        // }
        // System.out.println("End");
    }
}
