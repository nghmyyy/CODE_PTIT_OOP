import java.util.*;
public class J02012_sap_xep_chen {
    public static void sort(int a[], int n){
        for(int i = 1; i < n ; i++){
            for(int j = i + 1; j <= n; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[101];
        for(int i =1; i <= t; i++){
            a[i] = sc.nextInt();
        }
        int x = 0;
        System.out.println("Buoc " + x + ": " + a[1]);
        x++;
        for(int i = 2; i <= t; i++){
            System.out.print("Buoc " + x + ": ");
            for(int j = 1; j <= i; j++){
                sort(a, i);
            }
            for(int j = 1; j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");
            x++;
        }
        sc.close();
    }
}
