import java.util.*;
import java.io.*;
import java.text.*;
class SV{
    private static int stt = 1;
    private String id;
    private String name;
    private String dob;
    private String clss;
    private double gpa;

    public SV(String name, String clss, String dob, double gpa) throws ParseException{
        this.name = name;
        this.clss = clss;
        this.gpa = gpa;
        this.id = "B20DCCN" + String.format("%03d", stt++);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = formatter.format(formatter.parse(dob));
    }
    public String toString(){
        return id + " " + name + " " + clss + " " + dob + " " + String.format("%.2f", gpa);
    }

}
public class J07010_ds_sv_trong_file_2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.valueOf(sc.nextLine());
        SV[] svien = new SV[n + 1];
        for(int i = 0; i < n ; i++){
            String name = sc.nextLine();
            String clss = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            svien[i] = new SV(name, clss, dob, gpa);
        }
        for(int i = 0; i < n; i++){
            System.out.println(svien[i].toString());
        }
    }
}
