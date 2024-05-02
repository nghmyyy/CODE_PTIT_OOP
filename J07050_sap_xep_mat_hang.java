import java.util.*;
import java.io.*;
class MHang{
    private static int stt = 1;
    private String id;
    private String name, nhom_hang;
    private double mua;
    private double ban;

    public MHang(String nhom_hang, String name, double mua, double ban){
        this.name = name;
        this.nhom_hang = nhom_hang;
        this.mua = mua;
        this.ban = ban;
        this.id = "MH" + String.format("%02d", stt++);
    }
    public double getLN(){
        return ban - mua;
    }
    public String toString(){
        return id + " "  + name + " " + nhom_hang + " " + String.format("%.02f", getLN());
    }
}
public class J07050_sap_xep_mat_hang {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.valueOf(sc.nextLine());
        MHang[] mh = new MHang[n];
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String nhom_hang = sc.nextLine();
            double mua = Double.valueOf(sc.nextLine());
            double ban = Double.valueOf(sc.nextLine());
            mh[i] = new MHang(nhom_hang, name, mua, ban);
        }
        Arrays.sort(mh, new Comparator<MHang>(){
            public int compare(MHang mh1, MHang mh2){
                return (int) (mh2.getLN() - mh1.getLN());
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(mh[i]);
        }
    }
}
