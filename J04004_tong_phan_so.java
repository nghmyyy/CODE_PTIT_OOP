import java.util.*;
class tong_phan_so{
    private int x;
    private int y;

    public tong_phan_so(int x, int y){
        this.x = x;
        this.y = y;
    }
    private int ucln(int x, int y){
        while( y != 0){
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String tong(tong_phan_so others){
        int tong_mau = y * others.getY() / ucln(y, others.y);
        int tong_tu = x * tong_mau /  + others.getX() * y;
        int gcd = ucln(tong_mau, tong_tu);
        tong_tu /= gcd;
        tong_mau /= gcd; 
        return tong_tu + "/" + tong_mau;
    }
}
public class J04004_tong_phan_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        tong_phan_so ps1 = new tong_phan_so(x1, y1);
        tong_phan_so ps2 = new tong_phan_so(x2, y2);
        System.out.println(ps1.tong(ps2));
        sc.close();
    }
}
