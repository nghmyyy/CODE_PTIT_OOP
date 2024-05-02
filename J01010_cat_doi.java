import java.util.*;
public class J01010_cat_doi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String n = sc.next();
            int ck = 0;
            for(int i = 0; i < n.length(); i++){
                char x = n.charAt(i);
                if( x != '1' && x != '0' && x != '8' && x != '9'){
                    System.out.println("INVALID");
                    ck++;
                    break;
                }
            }   
            if(ck == 0){
                String n1 = n.replace('8', '0');
                n1 = n1.replace('9', '0');
                long ans = Long.parseLong(n1);
                if(ans == 0){
                    System.out.println("INVALID");
                }
                else{
                    System.out.println(ans);
                }
            }
        }
        sc.close();
    }
}