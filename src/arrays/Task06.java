package arrays;

import java.util.Random;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task06 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int min = 10;
        int max = 99;
        Random rand = new Random();
        int increment = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                increment++;
            }
        }
        System.out.println();
        if (increment == 0){
            System.out.println("Array is strictly increasing sequence");
        }else{
            System.out.println("Array is not strictly increasing sequence");
        }
    }
}

//6.	Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку. Определить и вывести на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.
