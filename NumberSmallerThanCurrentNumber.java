import java.util.Scanner;

public class NumberSmallerThanCurrentNumber {
    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i != j) {
                    if (nums[j] > nums[i]) {
                        count++;
                    }
                }
            }
            arr[j] = count;
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
        System.out.println("The total numbers smaller than the current number is  : ");
        int arr1[] = smallerNumbersThanCurrent(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
