package arrays;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task09 {
    public static void main(String[] args) {
        int arrLength = 10;
        int arr1[] = new int[arrLength];
        int arr2[] = new int[arrLength];
        double arr3[] = new double[arrLength];
        int min = 1;
        int max = 9;
        int amountOfIntNumbers = 0;

        for (int i = 0; i < arrLength; i++) {
            arr1[i] = getRandomNumber(min, max);
            arr2[i] = getRandomNumber(min, max);
            arr3[i] = (double) arr1[i] / arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 1.0 == 0.0){
                amountOfIntNumbers++;
            }
        }

        printArray(arr1);
        printArray(arr2);
        printArrayDouble(arr3);
        System.out.println("Amount of integer numbers in 3rd array: " + amountOfIntNumbers);


    }

    static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + min) + 1;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t\t");
        }
        System.out.println();
    }

    static void printArrayDouble(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t\t");
        }
        System.out.println();
    }
}

//9.	Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
// индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
// затем вывести количество целых элементов в третьем массиве.