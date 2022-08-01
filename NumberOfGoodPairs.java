import java.util.Scanner;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i < j) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs n = new NumberOfGoodPairs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the element for the array : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The total number of good pairs is : " + n.numIdenticalPairs(arr));
    }
}
