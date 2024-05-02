import java.util.*;
public class J03038_danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i < s.length() - 1; i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    s = s.substring(0, j) + s.substring(j + 1);
                    j--;
                }
            }
        }
        System.out.println(s.length());
        sc.close();
    }
}
