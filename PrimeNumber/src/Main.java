import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class Main {
    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số lượng số nguyên tố: ");
        int num = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            if (isPrimeNum(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
        System.out.println("100 số nguyên tố đầu tiên:");
        for (int i = 2; i < 100; i++) {
            if (isPrimeNum(i)) {
                System.out.println(i);
            }
        }
    }
}