//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package homeworks1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MainClassFromLessonOne {
    public MainClassFromLessonOne() {
    }

    public static void main(String[] args) {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}






//2. Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.



public class MainClassLessonTwo {
    class MainClassFromLessonTwo() {
        public static void main(String[] args) {
            int[] nums = {3, 1, 2, 3, 1, 3};
            for (int x : nums) System.out.print(x + " ");
            System.out.println();
            sortValue(nums, 3);
            for (int x : nums) System.out.print(x + " ");
        }

        public static void sortValue(int[] arr, int k) {
            int i, j = 0;
            for (i = 0; i < arr.length; i++)
                if (arr[i] != k) arr[j++] = arr[i];

            for (i = j; i < arr.length; i++) arr[i] = k;
        }
    }

}
