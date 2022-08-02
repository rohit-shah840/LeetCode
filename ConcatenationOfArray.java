import java.util.Scanner;

import javax.crypto.spec.GCMParameterSpec;

public class ConcatenationOfArray {
    static public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l * 2];
        int j = 0;
        for (int i = 0; i < l; i++) {
            ans[j] = nums[i];
            j++;
        }

        for (int i = 0; i < l; i++) {
            ans[j] = nums[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("After the concatenation function is called  : ");
        int[] arr1 = getConcatenation(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
