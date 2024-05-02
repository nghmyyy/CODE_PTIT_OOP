import java.util.*;
class Gvien{
    private String ma;
    private String name;
    private long luong;
    private int he_so = 0;
    
    public Gvien(String ma, String name, long luong){
        this.ma = ma;
        this.name= name;
        this.luong = luong;
    }
    public int getHe_so(){
        String tmp = ma.substring(2);
        he_so = Integer.valueOf(tmp);
        return he_so;
    }
    public long get_pc(){
        long pc = 0;
        String tmp = String.valueOf(ma.charAt(0)) + String.valueOf(ma.charAt(1));
        if(tmp.equals("HT")){
            pc = 2000000;
        }
        if(tmp.equals("HP")){
            pc = 900000;
        }
        if(tmp.equals("GV")){
            pc = 500000;
        }
        return pc;
    }
    public long getLuong(){
        return luong * getHe_so() + get_pc();
    }
    public void display(){
        System.out.print(ma + " " + name + " " + getHe_so() + " " + get_pc() + " " + getLuong());
    }
}
public class J04015_tinh_thu_nhap_gv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ma = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
        long luong = sc.nextLong();
        Gvien gv = new Gvien(ma, name, luong);
        gv.display();
        sc.close();
    }
}
