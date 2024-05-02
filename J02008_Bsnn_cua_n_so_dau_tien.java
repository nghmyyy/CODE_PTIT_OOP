import java.util.*;
public class J02008_Bsnn_cua_n_so_dau_tien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long ans = 1;
            boolean prime[] = new boolean[101];
            for(int i = 2; i <= 100; i++){
                prime[i] = true;
            }
            for(int i = 2; i <= 100; i++){
                if(prime[i] == true){
                    for(int j = 2*i; j <= 100; j+=i){
                        prime[j] = false;
                    }
                }
            }
            /*for(int i = 2; i <= 100; i++){
                if(prime[i] == true){
                    System.out.print(i + " ");
                }
            }
            */
            for(int i = 2; i <= n; i++){
                if(prime[i] == true){
                    long tmp = i;
                    while(tmp <= n){
                        tmp = tmp * (long)i;
                    }
                    if(tmp > n){
                        tmp /= (long)i;
                    }
                    //System.out.print(tmp +" "+ i);
                    ans *= tmp;
                }
            }
            System.out.println(ans);
            
            t--;
        }
        sc.close();
    }
}
