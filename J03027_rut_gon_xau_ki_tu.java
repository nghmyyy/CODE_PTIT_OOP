import java.util.*;
public class J03027_rut_gon_xau_ki_tu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(true){
            boolean check = true;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    if(i == 0){
                        s = s.substring(i + 2);
                        check = false;
                        // System.out.println(s);
                        i--;
                    }
                    else if(i == s.length() - 1){
                        s = s.substring(0, i);
                        check = false;
                        // System.out.println(s);
                        i--;
                    }
                    else{
                        s = s.substring(0, i) + s.substring(i + 2);
                        check =false;
                        i--;
                        // aSystem.out.println(s);
                    }
                }
            }
            if(check == true){
                if(s.length() == 0){
                    System.out.println("Empty String");
                }
                else{
                    System.out.println(s);
                }
                break;
            }
            sc.close();
        }
    }
}
