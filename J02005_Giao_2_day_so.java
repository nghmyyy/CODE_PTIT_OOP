import java.util.*;
public class J02005_Giao_2_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[100];
        int b[] = new int[100];
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            set1.add(a[i]);
        }
        for(int i = 1; i <= m; i++){
            b[i] = sc.nextInt();
            set2.add(b[i]);
        }
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int used[] = new int[2001];
        for(int i = 0; i <= 1000; i++){
            used[i] = 0;
        }
        while(it1.hasNext()){
            int x = it1.next();
            used[x] = 1;
        }
        while(it2.hasNext()){
            int x = it2.next();
            used[x]++;
        }
        for(int i = 0; i <= 1000; i++){
            if(used[i] == 2){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
