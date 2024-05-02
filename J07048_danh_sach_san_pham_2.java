import java.util.*;
import java.io.*;
class SP{
    private String id, name;
    private int price, month;
    public SP(String id, String name, int price, int month){
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
    }
    public int getPrice(){
        return price;
    }
    public String getID(){
        return id;
    }
    public String toString(){
        return id + " " + name + " " + price + " " + month;
    }
}
public class J07048_danh_sach_san_pham_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.valueOf(sc.nextLine());
        SP[] sp = new SP[n];
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.valueOf(sc.nextLine());
            int month = Integer.valueOf(sc.nextLine());
            sp[i] = new SP(id, name, price, month);
        } 
        Arrays.sort(sp, new Comparator<SP>(){
            public int compare(SP sp1, SP sp2){
                if(sp2.getPrice() != sp1.getPrice()){
                    return sp2.getPrice() - sp1.getPrice();
                }
                else{
                    return sp1.getID().compareTo(sp2.getID());
                }
            }
        } );
        for(int i = 0; i < n; i++){
            System.out.println(sp[i]);
        }
    }
}
