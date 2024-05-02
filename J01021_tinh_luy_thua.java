import java.util.Scanner;
public class J01021_tinh_luy_thua {
    public static long luythua(long a, long b){
        if(b != 0){
            long x = luythua(a, b/2);
            if(b%2 == 0){
                return (x * x) % (1000000000 + 7);
            }
            else{
                return (x * x * a) % (1000000000 + 7);
            }
        }
    }
    public static void main(String[] args){

    }
}
