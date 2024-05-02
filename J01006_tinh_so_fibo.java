import java.util.Scanner;

public class J01006_tinh_so_fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int n = sc.nextInt();
            if(n <= 2){
                System.out.println("1");
            }
            else{
                long f = 0;
                long f1 = 1, f2 = 1;
                for(int i = 3; i <= n; i++){
                    f = f1 + f2;
                    f1 = f2;
                    f2 = f;
                }
                System.out.println(f);

            }
            t--;
        }
        sc.close();
    }
    
}
