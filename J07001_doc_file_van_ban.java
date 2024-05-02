import java.util.*;
import java.io.*;
public class J07001_doc_file_van_ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    } 
}
