import java.util.Scanner;
import java.lang.Math;
public class J01014_uoc_so_nto_lon_nhat {
    public static long max(long n){
        long ans = 0;
        for(long i = 2; i <= Math.sqrt(n); i++){
            while(n%i == 0){
                n /= i;
                ans = i;
            }
        }
        if(n > 1){
            ans = n;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            System.out.println(max(n));
            t--;
        }
        sc.close();
    }
}
