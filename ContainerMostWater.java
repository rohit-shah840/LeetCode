import java.util.Scanner;
import java.util.*;

public class ContainerMostWater {
    static public int maxArea(int[] h, int n) {
        // time complexity is O(n^2).
        // int m = 0, max;
        // int i, j;
        // for (i = 0; i < n - 1; i++) {
        // for (j = i + 1; j < n; j++) {
        // if (h[i] <= h[j]) {
        // max = h[i] * (j - i);
        // if (m <= max) {
        // m = max;
        // }
        // } else {
        // max = h[j] * (j - i);
        // if (m <= max) {
        // m = max;
        // }
        // }
        // }
        // }
        // return m;

        // Time conplexity is O(n)
        int max_area = 0;
        int left_index = 0;
        int right_index = h.length - 1;
        while (left_index < right_index) {
            int left_height = h[left_index];
            int right_height = h[right_index];
            int min_height = Math.min(left_height, right_height);
            max_area = Math.max(max_area, min_height * (right_index - left_index));
            if (left_height < right_height)
                left_index++;
            else
                right_index--;
        }
        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The max area is : " + maxArea(a, x));
    }
}
