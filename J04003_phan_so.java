import java.util.*;
 class PhanSo{
    private long tu_So;
    private long mau_So;

    public PhanSo(long tu_So, long mau_So){
        this.tu_So = tu_So;
        this.mau_So = mau_So;
    }
    public long ucln(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void display(){
        long uoc_chung = ucln(tu_So, mau_So);
        mau_So = mau_So / uoc_chung;
        tu_So = tu_So / uoc_chung;
        System.out.println( tu_So +  "/" + mau_So);
    }
}
public class J04003_phan_so{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        PhanSo ps1 = new PhanSo(tuSo, mauSo);
        ps1.display();
        sc.close();
    }
}
