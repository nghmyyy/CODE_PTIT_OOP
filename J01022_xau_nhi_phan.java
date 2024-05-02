import java.util.*;
public class J01022_xau_nhi_phan{
    public static long[] f = new long[101];
    public static void fibo(){
        f[1] = f[2] = 1;
        for(int i = 3; i <= 100; i++){
            f[i] = f[i - 2] + f[i - 1];
        }
    }
    public static char find(long k, int n){
        if(n==1){
            return '0';
        }
        if(n==2){
            return '1';
        }
        if(k < f[n-2]){
            return find(k, n - 2);
        }
        else{
            return find(k - f[n-2], n - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(k,n));
            
        }
        sc.close();
    }
}