package arrays;

/**
 * Created by Андрей on 06.09.2017.
 */
public class Task01 {
    public static void main(String[] args) {

        int arrLength = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                arrLength++;
            }
        }

        int[] arr = new int[arrLength];
        int index = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                arr[index] = i;
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}


//1.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
// отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.
//        2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20
