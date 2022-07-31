import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PowerFunction {
    static public double myPow(double x, int n) {

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while (n != 0) {
            if ((n & 1) != 0) {
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base radix and power  radix:");
        double base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println("The power of " + power + " this to " + base + " is  " + myPow(base, power));
    }
}
