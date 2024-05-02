import java.util.*;
import java.io.*;
class Pair<T1, T2>{
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    private static boolean check_prime(int a){
        if(a < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(a); i++){
                if(a % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isPrime(){
        if(check_prime((Integer)first) && check_prime((Integer)second)){
            return true;
        }
        return false;
    }
    public String toString(){
        return first + " " + second;
    }
}
public class J07017_lop_pair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
        sc.close();
    }
}
