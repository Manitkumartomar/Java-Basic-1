import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int min, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            // loop for upper right part
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }
        // loop for lower left part
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            // loop for lower right part
            for (j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }
    }
}