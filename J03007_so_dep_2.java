import java.util.*;
public class J03007_so_dep_2 {
    public static boolean check_tn(String s){
        if(s.length() % 2 != 0){
            for(int i = 0; i <= s.length()/2 + 1; i++){
                if(i != s.length() - 1 - i && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    return false;
                }
            }
        }
        else{
            for(int i = 0; i <= s.length()/2 ; i++){
                if(i != s.length() - 1 - i && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check_dau_cuoi(String s){
        char dau = s.charAt(0);
        char cuoi = s.charAt(s.length() - 1);
        if(dau == '8' && cuoi == '8'){
            return true; 
        }
        return false;
    }
    public static boolean check_tong(String s){
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            int x = Character.getNumericValue(s.charAt(i));
            //System.out.println(x);
            sum += x;
        }
        //System.out.println(sum);
        if (sum % 10 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            if(check_dau_cuoi(s) == true && check_tong(s) == true && check_tn(s) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
