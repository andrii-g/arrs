package arrays;

import java.util.Random;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task04 {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        Random rand = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 1){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

//4.	Создайте массив из 8 случайных целых чисел из отрезка [1;10].
//        Выведите массив на экран в строку.
//        Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.