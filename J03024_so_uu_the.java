import java.util.*;
public class J03024_so_uu_the {
   public static boolean check_chu(String s){
        if(s.charAt(0) == '0'){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x < '0' || x > '9'){
                return false;
            }
        }
        return true;
   }
   public static boolean check_so (String s){
        int odd = 0;
        int even = 0;
        for(int i = 0; i < s.length(); i++){
            int x = (int) s.charAt(i);
            if(x % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(even > odd && s.length() % 2 == 0){
            return true;
        }
        else if(odd > even && s.length() % 2 != 0){
            return true;
        }
        else{
            return false;
        }
   } 
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            if(check_chu(s) == false){
                System.out.println("INVALID");
            }
            else{
                if(check_so(s) == true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            t--;
        }
        sc.close();
   }
}
