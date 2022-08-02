import java.util.Scanner;

public class RunningSumOf1DArray {
    static public int[] runningSum(int[] nums) {
        int l = nums.length;
        int arr[] = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
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
        System.out.println("After the buildArray permutation function is called  : ");
        int[] arr1 = runningSum(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
