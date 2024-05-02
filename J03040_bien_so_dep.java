import java.util.*;
public class J03040_bien_so_dep {
    public static String chuanHoa(String s){
        String tmp = s.substring(5, 8) + s.substring(9,11);
        return tmp;
    }
    public static boolean t_giam(String s){
        for(int i = 0; i < s.length() - 1; i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i+1));
            if(a >= b ){
                return false;
            }
        }
        return true;
    }
    public static boolean b_nhau(String s){
        for(int i = 0; i < s.length() - 1; i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i+1));
            if(a != b ){
                return false;
            }
        }
        return true;
    }
    public static boolean dau_cuoi(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2) && s.charAt(3) == s.charAt(4)){
            return true;
        }
        return false;
    }
    public static boolean loc_phat(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String s = sc.next();
            s = chuanHoa(s);
            if(t_giam(s) == true || b_nhau(s) == true || dau_cuoi(s) == true || loc_phat(s) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
