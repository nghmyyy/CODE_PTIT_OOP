import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    private char room_id;
    private String room;
    private int price;
    private double fee;

    public LoaiPhong(String s){
        String[] tmp = s.split(" ");
        this.room_id = tmp[0].charAt(0);
        this.room = tmp[1];
        this.price = Integer.valueOf(tmp[2]);
        this.fee = Double.valueOf(tmp[3]);
    }
    public String getRoom(){
        return room;
    }
    @Override 
    public String toString(){
        return room_id + " " + room + " " + price + " " + fee;
    }
    @Override
    public int compareTo(LoaiPhong o){
        return room.compareTo(o.getRoom());
    }
}
public class J07045_loai_phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
