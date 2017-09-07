package arrays;

import java.util.Random;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task05 {
    public static void main(String[] args) {
        int arrsLength = 5;
        Random rand = new Random();
        int max = 5;
        int min = 0;
        int[] arr1 = new int[arrsLength];
        int[] arr2 = new int[arrsLength];
        int sum1 = 0;
        int sum2 = 0;
        double average1 = 0.0;
        double average2 = 0.0;

        for (int i = 0; i < arrsLength; i++) {
            arr1[i] = rand.nextInt((max - min) + 1) + min;
            arr2[i] = rand.nextInt((max - min) + 1) + min;
        }

        for (int i = 0; i < arrsLength; i++) {
            System.out.print(arr1[i] + " ");
            sum1+=arr1[i];
        }
        System.out.println();
        for (int i = 0; i < arrsLength; i++) {
            System.out.print(arr2[i] + " ");
            sum2+=arr2[i];
        }
        System.out.println();
        average1 = sum1/arrsLength;
        average2 = sum2/arrsLength;
        if (average1 > average2){
            System.out.println("Average of 1 array is greater");
        }else if (average2 > average1){
            System.out.println("Average of 2 array is greater");
        }else {
            System.out.println("Average of both arrays is equal");
        }
        System.out.println("Average of 1 array: " + average1);
        System.out.println("Average of 2 array: " + average2);
    }
}

//5.	Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше
// (либо сообщите, что их средние арифметические равны).