import java.util.*;
import java.io.*;
class XT{
    private static int stt = 1;
    private String name, dob, id;
    private double l_thuyet, t_hanh;
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
    public XT(String name, String dob, double l_thuyet, double t_hanh){
        this.id = "PH" + String.format("%02d", stt++);
        this.name = chuanHoa(name);
        this.dob = dob;
        this.l_thuyet = l_thuyet;
        this.t_hanh = t_hanh;
    }
    public int getAge(){
        int year = Integer.valueOf(dob.substring(dob.length() - 4));
        return 2021 - year;
    }
    public int getDiem(){
        int diem = (int) Math.round((l_thuyet + t_hanh) / 2);
        if(l_thuyet >= 8 && t_hanh >= 8){
            diem += 1;
        }
        else if(l_thuyet < 8 && t_hanh < 8 && l_thuyet >= 7.5 && t_hanh >= 7.5){
            diem += 0.5;
        }
        if(diem > 10){
            diem = 10;
        }
        return diem;
    }
    public String getXH(){
        if(getDiem() < 5){
            xh = "Truot";
        }
        else if(getDiem() >= 5 && getDiem() <= 6){
            xh = "Trung binh";
        }
        else if(getDiem() == 7){
            xh = "Kha";
        }
        else if(getDiem() == 8){
            xh = "Gioi";
        }
        else if(getDiem() >=  9){
            xh = "Xuat sac";
        }
        return xh;
    }
    public String toString(){
        return id + " " + name +  " " + getAge() + " " + getDiem() + " " + getXH(); 
    }
}
public class J07053_xet_tuyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.valueOf(sc.nextLine());
        XT[] xt = new XT[n];
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double l_thuyet = Double.parseDouble(sc.nextLine());
            double t_hanh = Double.parseDouble(sc.nextLine());
            xt[i] = new XT(name, dob, l_thuyet, t_hanh);
            System.out.println(xt[i]);
        }
    }

    
}
