import java.util.Scanner;
import java.lang.Math;
public class J01012_uoc_so_chia_het_cho_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextInt();
            int cnt = 0;
            for(long i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0 && i % 2 == 0){
                    cnt++;
                }
                long j = n/i;
                if(n % i == 0 && j != i && j % 2 == 0){
                    cnt++;
                }

            }
            if (n%2 == 0){
                cnt++;
            }
            System.out.println(cnt);
            t--;
        }
        sc.close();
    }
}