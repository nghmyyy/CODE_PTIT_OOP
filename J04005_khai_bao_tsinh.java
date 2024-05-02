import java.util.*;
class Thi_Sinh{
    private String name;
    private String dob;
    private double mon1, mon2, mon3;
    
    public  Thi_Sinh(String name, String dob, double mon1, double mon2, double mon3){
        this.name = name;
        this.dob = dob;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    public double getDiem(){
        return mon1 + mon2 + mon3;
    }
    public void display(){
        System.out.print(name + " " + dob + " ");
        System.out.printf("%.1f", getDiem());
    }
}
public class J04005_khai_bao_tsinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        String name = sc.nextLine();
        //sc.nextLine();
        String dob = sc.next();
        //sc.nextDouble();
        double mon1 = sc.nextDouble();
        double mon2 = sc.nextDouble();
        double mon3 = sc.nextDouble();
        Thi_Sinh ts1 = new Thi_Sinh(name, dob, mon1, mon2, mon3);
        ts1.display();
        sc.close();
    }
}
