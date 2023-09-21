import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            long[] arr = new long[n];
            for(int i = 0;i<n;i++)
                arr[i] = scan.nextInt();
            long sum = 0;
            for(int i = 1;i<n;i++){
                if(arr[i]<arr[i-1])
                {
                    sum+=(arr[i-1]-arr[i]);
                    arr[i] = arr[i-1];
                }
            }
            System.out.println(sum);
        }
    }
}
