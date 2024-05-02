import java.util.*;
import java.math.*; 
public class J03033_bcnn {
    public static BigInteger ucln(BigInteger a, BigInteger b){
        while(b != BigInteger.ZERO){
            BigInteger tmp = b;
            b = a.mod(b);
            a = tmp;
        }
        return a;
    }
    public static BigInteger bcnn(BigInteger a, BigInteger b){
        BigInteger tmp = a.multiply(b);
        return tmp.divide(ucln(a,b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            BigInteger a1 = new BigInteger(a);
            BigInteger b1 = new BigInteger(b);
            System.out.println(bcnn(a1, b1));
        }
        sc.close();
    }
}
