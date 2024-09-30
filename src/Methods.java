public class Methods {
    /**
     * Принимает параметр типа int и возводит его в квадрат.
     *
     * @param number переменная типа int.
     * @return возвращает параметр типа int возведённый в квадрат.
     */
    static int getSquare(int number) {
        return (int) Math.pow(number, 2);
    }

    /**
     * Создает полное имя из двух переменных типа String имя, фамилия.
     *
     * @param firstName переменная типа String имя.
     * @param lastName  переменная типа String фамилия.
     * @return возвращает полное имя, сформированное в результате конкатинации имени и фамилии.
     */
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    /**
     * Находит из переменных типа String самый короткий и длинный элемент.
     *
     * @param s varargs с переменными типа String для вычисления короткого и длинного элемента.
     * @return возвращает самый коротки и самый длинный элемент.
     */
    static String[] getCornerValuesArray(String... s) {
        int shortLine = s[0].length();
        int longLine = s[0].length();
        String shortWord = s[0];
        String longWord = s[0];
        for (String element : s) {
            if (element.length() < shortLine) {
                shortWord = element;
            }
            if (element.length() > longLine) {
                longWord = element;
            }
        }
        return new String[]{shortWord, longWord};
    }

    /**
     * Находит из переменных типа int самый маленький и самый большой элемент.
     *
     * @param numbers varargs с переменными типа int.
     * @return возвращает самый маленький и самый большой элемент.
     */
    static int[] getCornerValuesArray(int... numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int element : numbers) {
            if (minValue > element) {
                minValue = element;
            }
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return new int[]{minValue, maxValue};
    }

    /**
     * Находит из переменных типа char самый маленький и самый большой элемент.
     *
     * @param symbols varargs с пемеменными типа char.
     * @return возвращает самый маленький и самый большой элемент.
     */
    static char[] getCornerValuesArray(char... symbols) {
        char minValue = symbols[0];
        char maxValue = symbols[0];

        for (char element : symbols) {
            if (minValue > element) {
                minValue = element;
            }
            if (maxValue < element) {
                maxValue = element;
            }
        }
        return new char[]{minValue, maxValue};

    }
}
