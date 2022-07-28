import java.util.*;

public class ExcelSheetColumnTitle {
    static public String numberToTitle(int n) {
        String ans = "";
        while (n > 0) {
            int r = n % 26;
            if (r == 0) {
                ans = 'Z' + ans;
                n = (n / 26) - 1;
            } else {
                ans = (char) ('A' + (r - 1)) + ans;
                n /= 26;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column number :");
        int num = sc.nextInt();
        sc.close();
        System.out.println(numberToTitle(num));
    }
}
