import java.util.*;
public class J02010_sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int x = 1;
        for(int i = 1; i < n; i++){
            System.out.print("Buoc " + x + ": ");
            for(int j = i + 1; j <= n ; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            for(int e = 1; e <= n; e++){
                System.out.print(a[e] + " ");
            }
            System.out.print("\n");
            x++;
        }
        sc.close();
    }
}
