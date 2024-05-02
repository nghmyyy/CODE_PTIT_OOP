import java.util.Scanner;
public class J01024_so_tam_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            while(n > 0){
                if(n%10 != 0 && n % 10 != 1 && n % 10 != 2){
                    System.out.println("NO");
                    break;
                }
                n /= 10;
            }
            if(n == 0){
                System.out.println("YES");
            }
            t--;
        }
        sc.close();
    }
}
