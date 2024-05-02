import java.util.Scanner;

public class J01001_Hinh_chu_nhat {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("0");
        }
        else{
            int cvi = (a + b) * 2;
            int dientich = a * b;
            System.out.println(cvi + " " + dientich);
        }
        sc.close();
    }
}
