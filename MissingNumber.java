import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long[] arr = new long[(int) (n-1)];
        long sum_1 = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextLong();
            sum_1+=arr[i];
        }
    long sum = 0;
    for(int i=1;i<=n;i++){
        sum+=i;
    } 
    System.out.println(sum-sum_1);
    }
}
