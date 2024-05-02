import java.util.Scanner;
public class J01016_chu_so_4_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0; 
        int check = 0;
        while(n > 0){
            if(n % 10 == 4 || n % 10 == 7){
                cnt++;
            }
            if(cnt > 7){
                System.out.println("NO");
                check++;
                break;
            }
            n/=10;
        }
        if(check == 0){
            if(cnt == 4 || cnt == 7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
