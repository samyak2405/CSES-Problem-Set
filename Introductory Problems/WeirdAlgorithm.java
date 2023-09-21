import java.util.Scanner;

/**
 * WeirdAlgorithm
 */
public class WeirdAlgorithm {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Long n = scan.nextLong();
            while(n!=1){
                System.out.print(n+" ");
                if(n%2==0)
                    n /= 2;
                else
                    n = n*3+1;
        }
        System.out.print(1);
    }
    }
}