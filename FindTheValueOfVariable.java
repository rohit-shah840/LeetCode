import java.util.Scanner;

public class FindTheValueOfVariable {
    static public int finalValueAfterOperations(String[] o) {
        int x = 0;
        for (int i = 0; i < o.length; i++) {
            if (o[i].charAt(1) == '+') {
                x++;
            } else {
                x--;
            }

        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        String arr[] = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        System.out.println("After the finalvalueAfter operration is   : " + finalValueAfterOperations(arr));
    }
}
