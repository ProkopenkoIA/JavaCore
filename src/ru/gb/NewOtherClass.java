package ru.gb;

public class NewOtherClass {
    /**
     * Функция возведения числа в степень
     *
     * @param a основание степени
     * @param b показатель степени
     **/
    public static int pow(int a, int b) {
        return (int) Math.pow(a, b); // возврат без проверки переполнения

    }
}
