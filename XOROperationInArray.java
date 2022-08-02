import java.util.Scanner;

public class XOROperationInArray {
    static public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        int start = sc.nextInt();
        sc.close();
        System.out.println("The value after xor opertation in array is : " + xorOperation(num, start));

    }
}
