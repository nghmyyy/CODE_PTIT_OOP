import java.util.*;
import java.io.*;
import java.text.*;
class TS implements Comparable<TS> {
    private String id, name, xh;
    private double ly, hoa, toan;

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

    public TS(String id, String name, double toan, double ly, double hoa){
        this.id = id;
        this.name = chuanHoa(name);
        this.ly = ly;
        this.hoa = hoa;
        this.toan = toan;
    }
    public double getUT(){
        char x = id.charAt(2);
        if(x == '1') return 0.5;
        if(x == '2') return 1;
        if(x == '3') return 2.5;
        return 0;
    }

    public static String removeZero(double number){
        DecimalFormat formatter = new DecimalFormat("#.#");
        return formatter.format(number);
    }

    public double getDiem(){
        double diem = getUT() + ly + hoa + toan * 2;
        return diem;
    }

    public String getID(){
        return id;
    }
    public void setXH(String xh){
        this.xh = xh;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + removeZero(getUT()) + " " + removeZero(getDiem()) + " " + xh;
    }

    @Override
    public int compareTo(TS other){
        if(other.getDiem() != this.getDiem()){
            return this.getDiem() < other.getDiem() ? 1 : -1;
        }
        else{
            return this.getID().compareTo(other.getID());
        }
    }

}
public class J07052_danh_sach_trung_tuyen {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.valueOf(sc.nextLine());
        TS[] ts = new TS[n];
        ArrayList<TS> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ts[i] = new TS(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            a.add(ts[i]);
        }
        int cnt = Integer.valueOf(sc.nextLine());
        Collections.sort(a);

        double diemChuan = a.get(cnt - 1).getDiem();

        System.out.printf("%.1f", diemChuan);
        System.out.println("");
        for(TS i : a){
            if(i.getDiem() >= diemChuan){
                i.setXH("TRUNG TUYEN");
            }
            else{
                i.setXH("TRUOT");;
            }
        }
        for(TS i : a){
            System.out.println(i);
        }
    }
}
