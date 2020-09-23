package CodeTest;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number [1 - 5]: ");
        int i = scanner.nextInt();
        scanner.close();
        try {
            if (i < 1 || i > 5) {
                throw new Exception("Number is bound of from 1 to 5");
            } else System.out.println("Good boy");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
