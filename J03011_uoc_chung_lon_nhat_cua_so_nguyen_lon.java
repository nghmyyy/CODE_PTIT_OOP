import java.util.*;
import java.math.*;
public class J03011_uoc_chung_lon_nhat_cua_so_nguyen_lon {
    public static BigInteger ucln(BigInteger a, BigInteger b){
        while(!b.equals(BigInteger.ZERO)){
            BigInteger tmp = b;
            b = a.mod(b);
            a = tmp;
         }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a1 = sc.next();
            String b1 = sc.next();
            BigInteger a = new BigInteger(a1);
            BigInteger b = new BigInteger(b1);
            System.out.println(ucln(a,b));

        }
        sc.close();
    }
}
