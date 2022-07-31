import java.util.Scanner;

public class RotateImage {
    static public void rotateImage(int m[][]) {
        int r = m.length;
        int c = m[0].length;
        int i, j;

        System.out.println();
        for (i = 0; i < r; i++) {
            for (j = i; j < c; j++) {
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < c / 2; j++) {

                int t = m[i][j];
                m[i][j] = m[i][c - 1 - j];
                m[i][c - 1 - j] = t;
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square matrix size : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("Enter the elements of matrix " + a + " " + b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The matrix before rotated is : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The rotated image of " + a + " by " + b + " matrix is : ");
        rotateImage(arr);
    }
}
