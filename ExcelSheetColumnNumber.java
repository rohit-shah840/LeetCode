import java.util.*;

public class ExcelSheetColumnNumber {
    static public int titleToNumber(String n) {
        ;
        int sum = 0, i = 0;
        for (int j = n.length() - 1; j >= 0; j--) {
            char c = n.charAt(j);
            int val = (int) c - 64;
            sum += val * Math.pow(26, i);
            i++;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in capital in range of A- Z :");
        String str = sc.nextLine();
        sc.close();
        System.out.println(titleToNumber(str));
    }
}
