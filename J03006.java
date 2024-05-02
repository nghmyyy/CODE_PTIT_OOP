import java.util.*;
public class J03006 {
    public static boolean check_tn(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(i != s.length() && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean check_even(String s){
        for(int i = 0; i < s.length(); i++){
            int x = (int) s.charAt(i);
            if(x % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s =sc.next();
            if(check_tn(s) == true && check_even(s) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
            sc.close();
        }
    }
}
