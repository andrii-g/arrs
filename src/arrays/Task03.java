package arrays;

/**
 * Created by Андрей on 06.09.2017.
 */
public class Task03 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor(Math.random()*10);
        }


        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0){
                even++;
            }
        }
        System.out.println();
        System.out.println("Amount of even numbers is:" + even);
    }
}

//3.	Создайте массив из 15 случайных целых чисел из отрезка [0;9].
// Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
// выведете это количество на экран на отдельной строке.