import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Phong{
    private static int stt = 1;
    private String id, name, room;
    private long ngay, phat_sinh;

    public Phong(String name, String room, long ngay, long phat_sinh){
        this.name = name;
        this.room = room;
        this.ngay = ngay;
        this.phat_sinh = phat_sinh;
        this.id = "KH" + String.format("%02d", stt++);
    }
    public long getPrice(){
        char x = room.charAt(0);
        if(x == '1'){
            return ngay * 25 + phat_sinh;
        }
        else if( x == '2'){
            return ngay * 34 + phat_sinh;
        }
        else if(x == '3'){
            return ngay * 50 + phat_sinh;
        }
        else{
            return ngay * 80 + phat_sinh;
        }
    }
    @Override
    public String toString(){
        return id + " " + name + " " + room + "" + ngay + " " + getPrice();
    }

}
public class J07051_tinh_tien_phong {
    public static String chuanHoa(String s){
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        s = s.toLowerCase();
        String[] tmp = s.split(" ");
        s = "";
        for(int i = 0; i < tmp.length; i++){
            if(i == tmp.length - 1){
                s += ((String.valueOf(tmp[i].charAt(0))).toUpperCase() + tmp[i].substring(1));
            }
            else{
                s += ((String.valueOf(tmp[i].charAt(0))).toUpperCase() + tmp[i].substring(1)) + " ";
            }
        }
        return s;
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.valueOf(sc.nextLine());
        Phong[] phongs = new Phong[n];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i < n; i++){
            String name = (sc.nextLine());
            name = chuanHoa(name);
            String room = sc.nextLine();
            Date ngay_den = sdf.parse(sc.nextLine());
            Date ngay_di = sdf.parse(sc.nextLine());
            long ngay = (ngay_di.getTime() - ngay_den.getTime()) / (1000L * 60 * 60 * 24) + 1;
            long phat_sinh = Long.valueOf(sc.nextLine());
            phongs[i] = new Phong(name, room, ngay, phat_sinh);
        }
        Arrays.sort(phongs, new Comparator<Phong>() {
            public int compare(Phong p1, Phong p2){
                return (int) (p2.getPrice() - p1.getPrice());
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(phongs[i]);
        }
    }
}
