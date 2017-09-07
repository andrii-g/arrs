package arrays;

import java.util.Random;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task08 {
    public static void main(String[] args) {
        int arrLength = 12;
        int max = 15;
        int min = -15;
        int minTemp = min;
        int indexTemp = 0;
        Random random = new Random();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(arr[i] + " ");
            if (arr[i] >= minTemp){
                minTemp = arr[i];
                indexTemp = i;
            }
        }

        System.out.println("\n" + minTemp + " is max value in array. It's index is: " + indexTemp);
    }
}

//8.	Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите
// индекс его последнего вхождения в массив.