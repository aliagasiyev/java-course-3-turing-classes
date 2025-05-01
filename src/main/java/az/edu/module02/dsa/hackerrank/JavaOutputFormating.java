package az.edu.module02.dsa.hackerrank;

import java.util.Scanner;

public class JavaOutputFormating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int x = scanner.nextInt();
        String b = scanner.next();
        int y = scanner.nextInt();
        String c = scanner.next();
        int z = scanner.nextInt();
        System.out.print(a + "           " + x);
        System.out.printf(b + "            " + y);
        System.out.printf(c + "         " + z);
        System.out.println();
    }
}