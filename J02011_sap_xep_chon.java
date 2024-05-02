import java.util.*;
public class J02011_sap_xep_chon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i++){
            int x = i;
            System.out.print("Buoc " + x + ": ");
            int min = a[i];int k = i;
            for(int j = i + 1; j <= n; j++){
                if(min > a[j]){
                    min = a[j];
                    k = j;
                }
            }
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            for(int j = 1; j <=n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
