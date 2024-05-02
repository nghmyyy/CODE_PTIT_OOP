import java.util.*;
import java.io.*;
public class J07004_so_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int used[] = new int[100001];
        int a[] = new int[100001];
        int i = 1;
        while(sc.hasNext()){
            String s = sc.next();
            a[i] = Integer.valueOf(s);
            used[a[i]] += 1;
            i++;
        }
        Arrays.sort(a);
        for(int j = 1; j < i; j++){
            if(used[a[j]] != 0){
                System.out.println(a[j] + " " + used[a[j]]);
                used[a[j]] = 0;
            }
        }
        sc.close();
    }
}
