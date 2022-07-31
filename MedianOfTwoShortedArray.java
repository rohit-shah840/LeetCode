import java.util.Scanner;

public class MedianOfTwoShortedArray {
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int a[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                a[k] = nums1[i];
                i++;
            } else {
                a[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            a[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            a[k] = nums2[j];
            j++;
            k++;

        }
        if ((m + n) % 2 != 0) {
            return a[(m + n) / 2];
        } else {
            int x = (m + n) / 2;
            double r = a[x];
            double s = a[x - 1];
            return (r + s) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first and second array :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the array elements for first array .");
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array elements for second array .");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The median of  two array is : " + findMedianSortedArrays(arr1, arr2));
    }
}
