import java.util.Scanner;

public class NumberOfStepsToReduceToZero {
    static public int numberOfSteps(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n -= 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The total number of steps required to make num zero is  " + numberOfSteps(n));
    }
}
