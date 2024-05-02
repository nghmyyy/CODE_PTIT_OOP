import java.util.Scanner;
public class J01011_bcnn_ucln {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(bcnn(a,b) + " " + ucln(a,b));
            t--;
        }
        sc.close();
        
    }
    public static long ucln(long a, long b){
        while (a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
    public static long bcnn( long a, long b){
        long bc = a*b/ ucln(a,b);
        return bc;
    }
}
