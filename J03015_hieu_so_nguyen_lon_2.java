import java.util.*;
import java.math.BigInteger;
public class J03015_hieu_so_nguyen_lon_2 {
    public static String Chuan_hoa(String s){
        while( s.charAt(0) == '0' && s.length() > 1){
            s = s.substring(1);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        //int ck = 0;
        a = Chuan_hoa(a);
        b = Chuan_hoa(b);
        //System.out.println(a + " " + b);
        /*if(b.length() > a.length() || a.compareTo(b) != 1){
            ck++;
            String tmp = a;
            a = b; 
            b = tmp;
        }
        while(a.length() != b.length()){
            b = "0" + b;
        }
        String ans = "";
        int carry = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            int tmp = Character.getNumericValue(a.charAt(i)) - Character.getNumericValue(b.charAt(i)) - carry;
            if(tmp < 0){
                tmp += 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            ans = Integer.toString(tmp) + ans;
        }
        ans = Chuan_hoa(ans);
        if(ans.equals("0") != true &&  ck == 1){
            ans = "-" + ans;
        }
        System.out.println(ans);
        */
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        System.out.println(a1.subtract(b1));
        sc.close();
    }
}
