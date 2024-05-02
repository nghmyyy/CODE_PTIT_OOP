import java.util.*;
import java.io.*;
import java.text.*;
import java.time.*;
class KH{
    private static int stt = 1;
    private String customer_id, name, room_id;
    private int date;
    public KH(String name, String room_id, int date){
        this.name = name;
        this.room_id = room_id;
        this.date = date;
        this.customer_id = "KH" + String.format("%02d", stt++);
    }
    public int getDate(){
        return date;

    }
    @Override
    public String toString(){
        return customer_id + " " +  name + " " + room_id + " " + getDate();
    }
}
public class J07046_danh_sach_luu_tru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.valueOf(sc.nextLine());
        KH[] kh = new KH[n];
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String room_id = sc.nextLine();
            String ngay_den = formatter.format(formatter.parse(sc.nextLine()));
            String ngay_di = formatter.format(formatter.parse(sc.nextLine()));
            String[] nd = ngay_den.split("/");
            String[] ndi = ngay_di.split("/");
            LocalDate d1 = LocalDate.of(Integer.valueOf(nd[2]), Month.of(Integer.valueOf(nd[1])), Integer.valueOf(nd[0]));
            LocalDate d2 = LocalDate.of(Integer.valueOf(ndi[2]), Month.of(Integer.valueOf(ndi[1])), Integer.valueOf(ndi[0]));
            Period pe = Period.between(d1, d2);
            int date = pe.getDays();
            kh[i] = new KH(name, room_id, date);
        }
        Arrays.sort(kh, new Comparator<KH>(){
            public int compare(KH kh1, KH kh2){
                return (int) (kh2.getDate()- kh1.getDate());
            }
        });
        for(int i = 0 ; i < n; i++){
            System.out.println(kh[i]);
        }
        sc.close();
    }
}
