import java.util.Scanner;
public class J01017_so_lien_ke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            int ck = 0;
            while(n > 10){
                long a = n%10;
                long b = (n/10) % 10;
                if (a - b != 1 && b - a != 1){
                    //System.out.print(a +" " + b);
                    System.out.println("NO");
                    ck++;
                    break;
                }
                n /= 10;
            }
            if(ck == 0){
                System.out.println("YES");
            }
            t--;
        }
        sc.close();
    }
}
