import java.util.*;
public class J03008_so_dep_3 {
   public static boolean check_tn(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(i != s.length() && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean check_snt(String s){
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c != '2' && c != '3' && c != '5' && c != '7' && c != '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            String s = sc.next();
            if(check_tn(s) == true && check_snt(s) == true ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
