import java.util.*;
import java.io.*;
public class J07022_loai_bo_so_nguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a =new ArrayList<>();
        int n = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                n = Integer.valueOf(s);
            }
            catch(Exception e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String i : a){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
