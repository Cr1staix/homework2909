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
        if (s.length == 0) {
            return new String[]{null, null};
        }
        String shortWord = s[0];
        String longWord = s[0];
        for (String element : s) {
            if (element.length() < shortWord.length()) {
                shortWord = element;
            } else if (element.length() > longWord.length()) {
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
    static Integer[] getCornerValuesArray(int... numbers) {
        if (numbers.length == 0) {
            return new Integer[]{null, null};
        }
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int element : numbers) {
            if (minValue > element) {
                minValue = element;
            } else if (maxValue < element) {
                maxValue = element;
            }
        }
        return new Integer[]{minValue, maxValue};
    }

    /**
     * Находит из переменных типа char самый маленький и самый большой элемент.
     *
     * @param symbols varargs с пемеменными типа char.
     * @return возвращает самый маленький и самый большой элемент.
     */
    static Character[] getCornerValuesArray(char... symbols) {
        if (symbols.length == 0) {
            return new Character[]{null, null};
        }
        char minValue = symbols[0];
        char maxValue = symbols[0];

        for (char element : symbols) {
            if (minValue > element) {
                minValue = element;
            } else if (maxValue < element) {
                maxValue = element;
            }
        }
        return new Character[]{minValue, maxValue};

    }

    static int getFactorialWithError(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * getFactorialWithError(number - 1);
        }
    }

    static int getFactorialWithOutError(int number) {
        number = Math.abs(number);
        if (number == 1) {
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return number * getFactorialWithOutError(number - 1);
        }
    }
}
