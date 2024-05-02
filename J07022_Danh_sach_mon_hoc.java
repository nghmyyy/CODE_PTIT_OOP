import java.util.*;
import java.io.*;
class MH{
    private String id;
    private String name;
    private int cnt;
    public MH(String id, String name, int cnt){
        this.id = id;
        this.name = name;
        this.cnt = cnt;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return id + " " + name + " " + cnt;
    }
}
public class J07022_Danh_sach_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.valueOf(sc.nextLine());
        MH[] mhoc = new MH[n];
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int cnt = Integer.valueOf(sc.nextLine());
            mhoc[i] = new MH(id, name, cnt);
        }
        Arrays.sort(mhoc, new Comparator<MH>(){
            @Override
            public int compare(MH mh1, MH mh2){
                return mh1.getName().compareTo(mh2.getName());
            }
        }
        );
        for(int i = 0; i < n ; i++){
            System.out.println(mhoc[i]);
        }
        sc.close();
    }
}
