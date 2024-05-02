import java.util.*;
class Sinh_vien{
    private String msv = "B20DCCN001";
    private String name;
    private String clss;
    private String dob;
    private float gpa;

    public Sinh_vien(){
        this("", "", "", 0f);
    }

    
    public Sinh_vien(String name, String clss, String dob, float gpa){
        this.name = name;
        this.clss = clss;
        this.dob = dob;
        this.gpa = gpa;

    }
    

    public void setName(String name){
        this.name = name;
    }
    public void setClss(String clss){
        this.clss = clss;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String getClss(){
        return clss;
    }
    public String getDob(){
        if(dob.length() < 10){
            String[] tmp = dob.split("/");
            dob = "";
            if (tmp[0].length() < 2){
                tmp[0] = "0" + tmp[0];
                dob += tmp[0];
                dob += "/";
            }
            else{
                dob += tmp[0];
                dob += "/";
            }
            if (tmp[1].length() < 2){
                tmp[1] = "0" + tmp[1];
                dob += tmp[1];
                dob += "/";
            }
            else{
                dob += tmp[1];
                dob += "/";
            }
            dob += tmp[2];

        }
        return dob;
    }
    public float getGpa(){
        return gpa;
    }
    public void display(){
        System.out.print(msv + " " + getName() + " " + getClss() + " " + getDob() + " " );
        System.out.printf("%.2f", getGpa());
    }
}
public class J04006_khai_bao_sv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sinh_vien sv = new Sinh_vien();
        String name = sc.nextLine();
        String clss = sc.next();
        String dob = sc.next();
        float gpa = sc.nextFloat();
        
        sv.setName(name);
        sv.setClss(clss);
        sv.setDob(dob);
        sv.setGpa(gpa);
        sv.display();
        sc.close();
    }
}
