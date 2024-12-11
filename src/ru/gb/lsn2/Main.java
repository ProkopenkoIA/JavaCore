package ru.gb.lsn2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
       /* int arr[] = {1,2,3,4,5,6};
        int num = 7;
        int resultArr[] = AddLast(arr, num);
        System.out.println(Arrays.toString(resultArr));

        int resultArr2[] = AddIndex(arr, num, 3);
        System.out.println(Arrays.toString(resultArr2));*/

        int arrEvent[] = {1, -3, 0, 0,4, 6, 9};

        System.out.println("Исходный массив: "+Arrays.toString(arrEvent));
        System.out.println("Количество четных элементов в массиве = "+countEvens(arrEvent));

        System.out.println("Разница между самым большим и самым маленьким элементами = "+findDifference(arrEvent));
        System.out.println("Есть ли рядом стоящие нули? Ответ: "+twoZero(arrEvent));


    }

    public static int[] AddLast(int[] arr, int num){

        int tmpArr[] = new  int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){
            tmpArr[i] = arr[i];
        }
        tmpArr[arr.length] = num;
        return tmpArr;
    }

    public static int[] AddIndex(int[] arr, int num, int index){

        int tmpArr[] = new  int[arr.length + 1];
        int tmp = 0;
        if (!(index >= 0 && index <= arr.length)){

        }else if (index == arr.length) {
            tmpArr = AddLast(arr, num);
        }
        else{
        for (int i = 0; i < arr.length+1; i++){
            if (i==index) {
                tmpArr[i] = num;
                tmp++;
            } else {
                tmpArr[i] = arr[i-tmp];
            }
        }
        }

        return tmpArr;
    }

    /**Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     *
     * @param arr
     * @return int
     */
   public static int countEvens(int[] arr){
       int eventCount  = 0;
       for (int i = 0; i < arr.length; i++){
         if(arr[i]%2 == 0){
             eventCount++;
         }
       }
       System.out.println("------- Нахождение числа четных значений -------");
       return eventCount;
   }

    /**Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
     *
     * @param arr
     * @return
     * @throws Exception
     */
    public static int findDifference(int[] arr) throws Exception {
       if (arr.length == 0){
           throw new Exception("Массив пуст");
       }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)  // Поиск максимального и минимального значения
        {
            if (min > arr[i]) {min = arr[i];}
            if (max < arr[i]) {max = arr[i];}
        }
        System.out.println("------- Поиск разницы -------");
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
       return max - min;
    }

    /**Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     *
     * @param arr
     * @return
     */
    public static boolean twoZero(int[] arr) {
        System.out.println("------- Поиск рядом стоящих нулей -------");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0 && arr[i+1] == 0){
                return true;
            }
        }
        return false;
    }

}
