import java.util.Scanner;

public class SumOfAllSubArrayOddLength {
    static public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            int start = l - i;
            int end = i + 1;
            int total = start * end;
            int odd = total / 2;
            if (total % 2 == 1) {
                odd++;
            }
            sum += odd * arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the element for the array : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The total sum of sub array of odd lenght is : " + sumOddLengthSubarrays(arr));
    }
}
