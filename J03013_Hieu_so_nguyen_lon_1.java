import java.util.*;
public class J03013_Hieu_so_nguyen_lon_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            String y = sc.next();
            if(y.length() > x.length()){
                String tmp = x;
                x = y;
                y = tmp;
            }
            while(x.length() != y.length()){
                y = "0" + y;
            }
            String ans = "";
            int carry = 0;
            for(int i = x.length() - 1; i >= 0; i--){
                int tmp = Character.getNumericValue(x.charAt(i)) - Character.getNumericValue(y.charAt(i)) - carry;
                if(tmp < 0){
                    tmp += 10;
                    carry = 1;
                }
                else{
                    carry = 0;
                }
                ans = Integer.toString(tmp) + ans;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
