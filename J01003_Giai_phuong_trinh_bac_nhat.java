import java.util.Scanner;

public class J01003_Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == 0 && b == 0){
            System.out.println("VSN");
        }
        else if (a == 0 && b != 0 ){
            System.out.println("VN");
        }
        else{
            float ans = -b/a;
            System.out.printf("%.2f", ans);
        }
        sc.close();
    }
}
