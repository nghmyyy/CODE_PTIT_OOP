import java.util.*;
import java.io.*;
public class J07002_tinh_tong  {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                sum += Integer.parseInt(s);
            }
            catch(Exception e){

            }
        }
        System.out.println(sum);
        sc.close();
    }
}
