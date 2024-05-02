import java.util.*;
import java.io.*;
class WordSet{
    private Set<String> set;
    public WordSet(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<String>();
        while(sc.hasNext()){
            String s = sc.next();
            set.add(s.toLowerCase());
        }
    }
    public String toString(){
        String s = "";
        for(String i : set){
            s += i + "\n";
        }
        return s;
    }
}
public class J07007_liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws FileNotFoundException{
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
