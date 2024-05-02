import java.util.*;
public class J02034_bo_sung_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xh[] = new int[201];
        int a[] = new int[101];
        for(int j = 1; j <= 200; j++){
            xh[j] = 0;
        }
        for(int e = 1; e <= n;e++){
            a[e] = sc.nextInt();
        }
        int max = a[1];
        for(int i = 2; i <= n ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i = 1; i <= n; i++){
            xh[a[i]] = 1;
        }
        int check = 0;
        for(int i = 1; i <= max; i++){
            if(xh[i] == 0){
                System.out.println(i);
                check++;
            }
        }
        if(check == 0){
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
