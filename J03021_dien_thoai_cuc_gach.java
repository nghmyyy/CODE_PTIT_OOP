import java.util.*;
public class J03021_dien_thoai_cuc_gach {
    public static String Chuan_hoa(String s){
        s = s.toLowerCase();
        s = s.replaceAll("b", "a");
        s = s.replaceAll("c", "a");
        s = s.replaceAll("e", "d");
        s = s.replaceAll("f", "d");
        s = s.replaceAll("h", "g");
        s = s.replaceAll("i", "g");
        s = s.replaceAll("k", "j");
        s = s.replaceAll("l", "j");
        s = s.replaceAll("n", "m");
        s = s.replaceAll("o", "m");
        s = s.replaceAll("s", "p");
        s = s.replaceAll("q", "p");
        s = s.replaceAll("r", "p");
        s = s.replaceAll("u", "t");
        s = s.replaceAll("v", "t");
        s = s.replaceAll("x", "w");
        s = s.replaceAll("y", "w");
        s = s.replaceAll("z", "w");
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = Chuan_hoa(s);
            int ck = 0;
            for(int i = 0; i < s.length()/2 + 1; i++){
                if(i != s.length() - 1 - i && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    ck++;
                    System.out.println("NO");
                    break;
                }
            }
            if(ck == 0){
                System.out.println("YES");
            }
        }
        sc.close();

    }
}
