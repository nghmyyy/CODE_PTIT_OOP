import java.util.*;
public class J02101_in_ma_tran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int a[][] = new int[100][100];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int i = 1;
            while(i <= n){
                if(i % 2 != 0){
                    for(int j = 1; j <= n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                }
                else{
                    for(int j = n; j >= 1; j--){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                }
            }
            System.out.print("\n");
            t--;
        }
        sc.close();
    }
}
