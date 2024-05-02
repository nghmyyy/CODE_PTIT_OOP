import java.util.*;
import java.io.*;
import java.text.ParseException;
class Diem{
    private static int stt = 1;
    private String id;
    private String name;
    private double m1, m2, m3;
    private int xh;

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
    public Diem(String name, double m1, double m2, double m3){
        this.name = chuanHoa(name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.id = "SV" + String.format("%02d", stt++);
    }
    public double getDiem(){
        // lam tron 2 so sau dau phay
        return Math.round(((m1 * 3 + m2 * 3 + m3 * 2) / 8) * 100.0) / 100.0;
    }
    public void setXH(int xh){
        this.xh = xh;
    }
    public int getXH(){
        return xh;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        return id + " " + name + " " + getDiem() + " " + getXH();
    }
}
public class J07054_tinh_diem_trung_binh {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File ("BANGDIEM.in"));
        int n = Integer.valueOf(sc.nextLine());
        Diem[] diem = new Diem[n];
        for(int i = 0; i < n; i++){
            diem[i] = new Diem(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        }
        Arrays.sort(diem, new Comparator<Diem>() {
            public int compare(Diem d1, Diem d2){
                if(d1.getDiem() == d2.getDiem()){
                    return d1.getID().compareTo(d2.getID());
                }
                return d2.getDiem() > d1.getDiem() ? 1 : -1;
            }
        });
        double point = (int)diem[0].getDiem();
        int cnt = 1;
        for(int i = 0; i < n; i++){
            if(point == diem[i].getDiem()){
                diem[i].setXH(cnt);
            }
            else{
                point = diem[i].getDiem();
                cnt = i + 1;
                diem[i].setXH(cnt);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(diem[i]);
        }
    }
}
