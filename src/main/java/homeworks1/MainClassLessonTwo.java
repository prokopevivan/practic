package homeworks1;
import java.util.Arrays;
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
