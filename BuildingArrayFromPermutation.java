import java.util.Scanner;

public class BuildingArrayFromPermutation {
    static public int[] buildArray(int[] nums) {
        int length = nums.length;
        int ans[] = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[nums[i]];
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
        System.out.println("After the buildArray permutation function is called  : ");
        int[] ar = buildArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
