import java.util.Scanner;
import java.lang.Math;
public class J01008_phan_tich_thua_so_nto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(t > 0){
            long n = sc.nextInt();

            System.out.print("Test " + i + ": ");
            if(n==1){
                System.out.println(n + "(" + 1 + ")");
            }
            else{
                for(long j = 2; j <= Math.sqrt(n); j++){
                    int cnt = 0;
                    while(n%j == 0){
                        cnt += 1;
                        n /= j;
                    }
                    if(cnt > 0){
                        System.out.print(j + "(" + cnt + ") ");
                    }
                }
                if (n > 1){
                    System.out.print(n + "(" + 1 + ")");
                }
                System.out.print("\n");
            }
            i++;
            t--;
        }
        sc.close();
    }
}