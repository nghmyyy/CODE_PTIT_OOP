import java.util.*;
public class J03005_chuan_hoa_ho_ten_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] temp = s.split(" ");
            s = "";
            for(int i = 1; i < temp.length; i++){
                temp[i] = String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if(i < temp.length - 1){
                    s = s + temp[i] + " ";
                }
                else{
                    s = s + temp[i] + ", ";
                }
            }
            temp[0] = temp[0].toUpperCase();
            s += temp[0];
            System.out.println(s);
            t--;
        }
        sc.close();
    }
}
