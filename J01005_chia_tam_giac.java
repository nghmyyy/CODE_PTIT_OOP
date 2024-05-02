import java.util.Scanner;
import java.lang.Math;
public class J01005_chia_tam_giac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n;
            double h;
            n = sc.nextInt();
            h = sc.nextInt();
            double s = h, s1 = h / n;
            for(int i = 1; i <= n - 1; i++){
                double h1 = (Math.sqrt(s1*i)/Math.sqrt(s) * h);
                System.out.printf("%.6f", h1);
                System.out.print(" ");
            }
            System.out.println(" ");
            t--;
        }
        sc.close();

    }
}
