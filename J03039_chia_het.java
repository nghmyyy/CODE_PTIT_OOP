import java.util.*;
import java.math.*;
public class J03039_chia_het {
    public static Boolean check(BigInteger a, BigInteger b){
        if(a.mod(b).equals(BigInteger.ZERO)){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String x1 = sc.next();
            String x2 = sc.next();
            if(x1.compareTo(x2) != 1){
                String tmp = x1;
                x1 = x2;
                x2 = tmp;
            }
            BigInteger a = new BigInteger(x1);
            BigInteger b = new BigInteger(x2); 
            if(check(a,b) == true ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
