import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class RichestCoustember {
    static public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max <= sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of two D array ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter the values of 2-d array ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The RichestCoustember is " + maximumWealth(arr));
    }
}
