import java.util.Scanner;

/**
 * Repetitions
 */
public class Repetitions {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String result = scan.nextLine();
            long[] arr = new long[4];
            /**
             * 0 ->A
             * 1 ->C
             * 2 ->G
             * 3 ->T
             */
            int i = 0;
             while(i<result.length())
             {
                long cnt = 0;
                char ch = result.charAt(i);
                while(i<result.length() && ch==result.charAt(i)){
                    cnt++;
                    i++;
                }
                if(ch=='A')
                {
                    if(arr[0]<cnt)
                    arr[0] = cnt;
                }
                
                else if(ch=='C'){
                    if(arr[1]<cnt)arr[1] = cnt;
                }
                    
                else if(ch=='G'){
                    if(arr[2]<cnt)arr[2] = cnt;
                }
                else{
                    if(arr[3]<cnt)arr[3] = cnt;
                }
                    
             }

             long maxi = Long.MIN_VALUE;
             for(int j = 0;j<4;j++){
                maxi = Math.max(maxi,arr[j]);
             }
                
             System.out.println(maxi);
        }
    }
}