package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        // Top half
        for(int i = 1; i <= n; i++) {
            // Print leading spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            int num = 1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Bottom half
        for(int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            int num = 1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
