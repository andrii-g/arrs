package arrays;

/**
 * Created by Andrii_Grygoruk on 9/7/2017.
 */
public class Task07 {
    public static void main(String[] args) {
        int arrLength = 20;
        int[] arr = new int[arrLength];
        arr[0] = arr [1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//7.	Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Напоминаем, что первый и второй члены последовательности равны единицам,
// а каждый следующий — сумме двух предыдущих.

// 1 1 2 3 5 8