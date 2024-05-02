import java.util.*;
public class J03032_dao_tu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            for(int i = 0; i < temp.length ; i++){
                String st = "";
                for(int j = temp[i].length() - 1; j >= 0; j--){
                    st = st + String.valueOf(temp[i].charAt(j));
                }
                if (i < temp.length - 1){
                     System.out.print(st + " ");
                }
                else{
                    System.out.print(st);
                }
            }
            System.out.print("\n");
            t--;
        }
        sc.close();
    }
}