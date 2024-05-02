import java.util.Scanner;
public class J02004_mang_doi_xung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int a[] = new int[100];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            int check = 0;
            for(int i = 1; i <= n/2; i++ ){
                if(i != n - i + 1 && a[i] != a[n - i + 1]){
                    System.out.println("NO");
                    check++;
                    break;
                }
            }
            if(check == 0){
                System.out.println("YES");
            }
            t--;
        }
        sc.close();
    }
}
