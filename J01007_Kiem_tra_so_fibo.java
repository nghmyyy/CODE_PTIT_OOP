import java.util.Scanner;
public class J01007_Kiem_tra_so_fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            long n = sc.nextLong();
            if(n == 0 || n == 1){
                System.out.println("YES");
            }
            else{
                long f = 0;
                long f1 = 0, f2 = 1;
                for(long i = 2; i <= 87; i++){
                    f = f1 + f2;
                    f1 = f2;
                    f2 = f;
                    if (f == n){
                        System.out.println("YES");
                        break;
                    }
                    if (f > n){
                        System.out.println("NO");
                        break;
                    }
                }

            }
            t--;
        }
        sc.close();
    }
}
