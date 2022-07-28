import java.util.*;

public class AddDigit {
    static public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The sum of digits will be in single digits :" + addDigits(num));
    }
}
