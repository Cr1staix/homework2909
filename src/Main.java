import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        int numberToSquare1 = 2;
        int numberToSquare2 = 3;
        int numberToSquare3 = 4;
        int numberToSquare4 = 6;
        System.out.println(Methods.getSquare(numberToSquare1));
        System.out.println(Methods.getSquare(numberToSquare2));
        System.out.println(Methods.getSquare(numberToSquare3));
        System.out.println(Methods.getSquare(numberToSquare4));

    }

    static void task2() {
        String firstName = "Алексей";
        String lastName = "Юришин";
        System.out.println(Methods.getFullName(firstName, lastName));
    }

    static void task3() {
        String[] words = new String[]{"Java", "Hello world", "TOP", "!"};
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(words)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray("java", "me", "world", "coffee")));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(1, 2, 3, 5, -4)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray('4', '1', '8')));
    }
}