import java.util.*;
class Nhan_vien{
    private String mnv = "00001";
    private String name;
    private String gender;
    private String dob;
    private String address;
    private String mst;
    private String ngay_ki;

    public Nhan_vien(String name, String gender, String dob, String address, String mst, String ngay_ki){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.mst = mst;
        this.ngay_ki = ngay_ki;
    }
    public void display(){
        System.out.print(mnv + " " + name + " " + gender + " " + dob + " " + address + " " + mst + " " + ngay_ki);
    }
}
public class J04007_khai_bao_nvien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.next();
        String dob = sc.next();
        sc.nextLine();
        String address = sc.nextLine();
        String mst = sc.next();
        sc.nextLine();
        String ngay_ki = sc.nextLine();
        Nhan_vien nv1 = new Nhan_vien(name, gender, dob, address, mst, ngay_ki);
        nv1.display();
        sc.close();
    }
}
