package arrays;

/**
 * Created by Андрей on 06.09.2017.
 */
public class Task02 {
    public static void main(String[] args) {
        int arrLength = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                arrLength++;
            }
        }

        int arr[] = new int[arrLength];
        for (int i = 0, j = 0; i < 100; i++) {
            if (i % 2 == 1){
                arr[j] = i;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}


//2.	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку,
// но в обратном порядке (99 97 95 93 … 7 5 3 1).