import java.util.Scanner;
public class J02007_dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t > 0){
            int n = sc.nextInt();
            int a[] = new int[100006];
            int used[] = new int[100006];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i <= 100005; i++){
                used[i] = 0;
            }
            for(int i =1; i <= n; i++){
                if(used[a[i]] == 0){
                    used[a[i]] += 1;
                    for(int j = i + 1; j <= n + 1; j++){
                        if(a[i] == a[j]){
                            used[a[i]] ++;
                        }
                    }
                }
            }
            System.out.println("Test " + x +":");
            for(int i = 1; i <= n; i++){
                if(used[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + used[a[i]] + " lan");
                    used[a[i]] = 0;
                }
            }
            x++;
            t--;
        }
        sc.close();
    }
    
}
