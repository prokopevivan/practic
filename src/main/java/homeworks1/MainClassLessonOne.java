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
