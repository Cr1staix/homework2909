import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        cornerCase();
        factorialWithError();  // Тут программа вылетает с ошибкой
        factorialWithOutError();
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

    static void cornerCase() {
        String[] emptyArrayString = {};
        char[] emptyArrayChar = {};
        int[] emptyArrayInt = {};
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(emptyArrayString)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(emptyArrayChar)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(emptyArrayInt)));
        String[] wordsCornerTest1 = {"And", "JAVA", "Keybord", "I", "Phone", "Me", "Hockey is my favorite sport"};
        int[] numbersCornerTest1 = {-100, -90, -24, -102, -9};
        int[] numbersCornerTest2 = {0, 0, 0, 0, 0};
        char[] symbCornerTest1 = {'0', '9', 'A'};
        char[] symbCornerTest2 = {'a', 'A', 'C'};
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(wordsCornerTest1)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(numbersCornerTest1)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(numbersCornerTest2)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(symbCornerTest1)));
        System.out.println(Arrays.toString(Methods.getCornerValuesArray(symbCornerTest2)));
    }

    static void factorialWithError() {
        int num1 = 2;
        int num2 = 5;
        int num3 = -3;
        int num4 = 0;
        System.out.println(Methods.getFactorialWithError(num1));
        System.out.println(Methods.getFactorialWithError(num2));
        System.out.println(Methods.getFactorialWithError(num3));
        System.out.println(Methods.getFactorialWithError(num4));
    }

    static void factorialWithOutError() {
        int num1 = 2;
        int num2 = 5;
        int num3 = -3;
        int num4 = 0;
        System.out.println(Methods.getFactorialWithOutError(num1));
        System.out.println(Methods.getFactorialWithOutError(num2));
        System.out.println(Methods.getFactorialWithOutError(num3));
        System.out.println(Methods.getFactorialWithOutError(num4));
    }
}