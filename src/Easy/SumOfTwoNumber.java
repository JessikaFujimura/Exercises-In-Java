package Easy;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = Integer.sum(n1, n2);
        System.out.printf("SOMA = %d", sum);
        sc.close();
    }
}
