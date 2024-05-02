import java.util.*;
public class J03004_chuan_hoa_xau_ho_ten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        sc.nextLine();
        while(t > 0){
            String s = sc.nextLine();
            s = s.trim(); // xoa dau cach dau va cuoi string
            s = s.replaceAll("\\s+", " "); // xoa dau cach thua;     
            // chuan hoa lowcase and upcase
            String[] temp = s.split(" "); // tach sau
            s = "";
            for(int i = 0; i < temp.length; i++){
                temp[i] = temp[i].toLowerCase();
                temp[i] = String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                s += temp[i];
                if (i < temp.length){
                    s += " ";
                }

            }
            System.out.println(s);
            t--;
        }
        sc.close();
    }
}
