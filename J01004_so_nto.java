import java.util.Scanner;
import java.lang.Math;
public class J01004_so_nto{
    public static boolean so_nto(long a){
        if (a < 2) return false;
        for (long i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a = sc.nextInt();
            if (so_nto(a) == true){
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