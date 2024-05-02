import java.util.Scanner;
public class J01018_so_khong_lien_ke {
    public static long tong_cs(long n){
        long sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /= 10;
        }
        if(sum % 10 == 0){
            return 1;
        }
        return 0;
    }
    public static long k_lke(long n){
        while(n > 10){
            long a = n%10;
            long b = (n/10) % 10;
            if (a - b != 2 && b - a != 2){
                //System.out.print(a +" " + b);
                return 0;
            }
            n /= 10;
        }
            return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            if(tong_cs(n) == 1 && k_lke(n) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
