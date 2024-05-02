import java.util.Scanner;
public class J01013_tong_uoc_1 {
    public static int N = (int)2e6;
    public static int[] prime = new int[N+1];
    public static void check_prime(){
        for(int i = 2; i * i <= N; i++){
            if(prime[i] == 0){
                for(int j = i; j <= N; j += i){
                    if(prime[j] == 0){
                        prime[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= N; i++){
            if(prime[i] == 0){
                prime[i] = i;
            }
        }
    }
    public static long sum(int n){
        long ans = 0;
        while(n > 1){
            ans += prime[n];
            n /= prime[n];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        check_prime();
        while(n-- > 0){
            int i = sc.nextInt();
            if(i == 1){
                ans += 1;
            }
            else{
                ans += sum(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }

    
}