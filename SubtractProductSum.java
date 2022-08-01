import java.util.Scanner;

public class SubtractProductSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        SubtractProductSum s = new SubtractProductSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The Subtract of product and sum of digits of number is " + s.subtractProductAndSum(n));
    }
}
