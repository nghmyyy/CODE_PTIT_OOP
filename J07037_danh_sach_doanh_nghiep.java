import java.util.*;
import java.io.*;
class DNghiep{
    private String id, name;
    private int ssv;
    public DNghiep(String id, String name, int ssv){
        this.id = id;
        this.name = name;
        this.ssv= ssv;
    };
    public String getID(){
        return id;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + ssv;
    }
}
public class J07037_danh_sach_doanh_nghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.valueOf(sc.nextLine());
        DNghiep[] dnghiep = new DNghiep[n];
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int ssv = Integer.valueOf(sc.nextLine());
            dnghiep[i] = new DNghiep(id, name, ssv);
        }
        Arrays.sort(dnghiep, new Comparator<DNghiep>(){
            @Override
            public int compare(DNghiep dn1, DNghiep dn2){
                return dn1.getID().compareTo(dn2.getID());
            }
        }
        );
        for(int i = 0; i < n; i++){
            System.out.println(dnghiep[i]);
        }
    }
}
