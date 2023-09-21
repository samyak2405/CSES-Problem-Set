import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long n = scanner.nextLong();

            if (n == 1) {
                System.out.println(1);
            } else if (n == 2 || n == 3) {
                System.out.println("NO SOLUTION");
            } else {
                StringBuilder result = new StringBuilder();
                
                // Print even numbers first
                for (long i = 2; i <= n; i += 2) {
                    result.append(i).append(" ");
                }
                
                // Print odd numbers
                for (long i = 1; i <= n; i += 2) {
                    result.append(i).append(" ");
                }
                
                System.out.println(result.toString());
            }
        }
    }
}
