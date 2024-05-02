import java.util.*;
public class J02106_ma_tran_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1001][1001];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = 1; j <= 3; j++){
                if(a[i][j] == 1){
                    sum += 1;
                }
            }
            if(sum >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
