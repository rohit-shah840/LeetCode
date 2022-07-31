import java.util.Scanner;

public class MininumSumOfFourDigits {
    static public int minimumSum(int num) {
        int arr[] = new int[4];
        int i = 0, max = 0;
        while (num > 0 && i < 4) {
            int r = num % 10;
            arr[i] = r;
            num /= 10;
            i++;
        }
        for (i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four digits number :");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The minimun sum of four digits is : " + minimumSum(n));
    }
}
