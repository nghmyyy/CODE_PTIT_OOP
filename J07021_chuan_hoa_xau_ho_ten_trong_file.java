import java.util.*;
import java.io.*;
public class J07021_chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            s = s.trim();
            s = s.replaceAll("\\s+"," ");
            String[] tmp = s.split(" ");
            s = "";
            for(int i = 0; i < tmp.length; i++){
                tmp[i] = String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1).toLowerCase();
                s += tmp[i] + " ";
            }
            System.out.println(s);
        }
    }
}
