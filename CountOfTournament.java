import java.util.Scanner;

public class CountOfTournament {
    static public int numberOfMatches(int n) {
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The total number of matches are :" + numberOfMatches(num));
        sc.close();
    }
}
