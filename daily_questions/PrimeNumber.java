package daily_questions;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limmit");
        int LL = sc.nextInt();
        System.out.println("Enter the upper limmit");
        int UL = sc.nextInt();
        sc.close();
        for (int i = LL; i <= UL; i++) {
            if (checkPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkPrime(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}