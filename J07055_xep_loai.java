import java.util.*;
import java.io.*;
class XLoai implements Comparable<XLoai>{
     private static int stt = 1;
    private String id;
    private String name;
    private int m1, m2, m3;
    private String xh;

    private static String chuanHoa(String s){
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        s = s.toLowerCase();
        String[] tmp = s.split(" ");
        s = "";
        for(int i = 0; i < tmp.length; i++){
            if(i == tmp.length - 1){
                s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
            }
            else{
                s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1) + " ";
            }
        }
        return s;
    }
    public XLoai(String name, int m1, int m2, int m3){
        this.name = chuanHoa(name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.id = "SV" + String.format("%02d", stt++);
    }
    public double getDiem(){
        return m1 * 0.25 + m2 * 0.35 + m3 * 0.4; 
    }
    public String getXH(){
        if(getDiem() >= 8){
            xh = "GIOI";
        }
        else if(getDiem() < 8 && getDiem() >= 6.5){
            xh = "KHA";
        }
        else if(getDiem() < 6.5 && getDiem() >= 5){
            xh = "TRUNG BINH";
        }
        else{
            xh = "KEM";
        }
        return xh;
    }
    public String getID(){
        return id;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + String.format("%.02f",getDiem()) + " " + getXH();
    }
    @Override
    public int compareTo(XLoai o){
        if(o.getDiem() == this.getDiem()){
            return this.getID().compareTo(o.getID());
        }
        return o.getDiem() > this.getDiem() ? 1 : -1;
    }
}
public class J07055_xep_loai {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.valueOf(sc.nextLine());
        XLoai[] xl = new XLoai[n];
        for(int i = 0; i < n; i++){
            xl[i] = new XLoai(sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
        }
        Arrays.sort(xl);
        for(int i = 0; i < n; i++){
            System.out.println(xl[i]);
        }

    }
}
