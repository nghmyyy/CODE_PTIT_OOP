import java.util.*;
public class J02104_danh_sach_canh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1001][1001];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(a[i][j] == 1 && j >= i){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}