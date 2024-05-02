import java.io.*;
public class J07005_so_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] check = new int[1_000];
        for(int i = 0; i < 100_000; i++){
            check[dis.readInt()]++;
        }
        for(int i = 0; i < 1000; i++){
            if(check[i] > 0){
                System.out.println(i + " " + check[i]);
            }
        }
        dis.close();
    }
}
