import java.util.*;
public class J02013_sap_xep_noi_bot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[101];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int x = 1;
        while(true){
            int i = 1;
            int check = 0;
            for(int j = 1 + i; j <= n; j++){
                if(a[j - 1] > a[j]){
                    int tmp = a[j - 1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                    check++;
                }
            }
            if(check == 0){
                break;
            }
            else{
                System.out.print("Buoc " + x + ": ");
                for(int j = 1; j <= n; j++){
                    System.out.print(a[j] + " ");
                }
                System.out.print("\n");
                x++;
            }
        }
        sc.close();
    }
}
