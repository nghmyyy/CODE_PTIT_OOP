import java.util.*;
public class J02006_hop_cua_hai_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[100];
        int b[] = new int[100];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= n ; i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for(int i = 1; i <= m ; i++){
            b[i] = sc.nextInt();
            set.add(b[i]);
        }   
        Iterator<Integer> inter = set.iterator();
        while(inter.hasNext()){
            int x = inter.next();
            System.out.print(x + " ");
        }
        sc.close();        
    }
}
