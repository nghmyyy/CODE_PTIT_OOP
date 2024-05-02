import java.util.*;
class Hang{
    private String mh;
    private String type;
    private String don_vi;
    private long mua;
    private long ban;

    public Hang(String type, String don_vi, long mua, long ban){
        this.type = type;
        this.don_vi = don_vi;
        this.mua = mua;
        this.ban = ban;
    }
    public String getType(){
        return type;
    }
    public String getDonvi(){
        return don_vi;
    }
    public long getMua(){
        return mua;
    }
    public long getBan(){
        return ban;
    }
    public void setMH(String mh){
        this.mh = mh;
    }
    public String getMH(){
        return mh;
    }
    public long getLN(){
        return ban - mua;
    }
    @Override
    public String toString(){
        return getMH() + " " + getType() + " " + getDonvi() + " " + getMua() + " " + getBan() +" "+ getLN();
    }
}
public class J05081_danh_sach_mat_hang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Hang[] mat_hang = new Hang[t];
        for(int i = 0; i < t; i++){
            String type = sc.nextLine();
            String don_vi = sc.next();
            long mua = sc.nextLong();
            long ban = sc.nextLong();
            mat_hang[i] = new Hang(type, don_vi, mua, ban);
            sc.nextLine();
        } 
        for(int i = 0; i <= t - 1; i++){
            String s = "MH0"; 
            int j = i + 1;
            if(i < 9){
                s = s + "0" + Integer.toString(j);
            }
            else{
                s = s + Integer.toString(j);
            }
            mat_hang[i].setMH(s);
        }
        Arrays.sort(mat_hang, new Comparator<Hang>(){
            public int compare(Hang h1, Hang h2){
                if(h1.getLN() != h2.getLN()){
                    int ln = (int) h2.getLN() - (int) h1.getLN();
                    return ln;
                }
                else{
                    return h1.getMH().compareTo(h2.getMH());
                }
            }
        });
        for(int i = 0; i < t ; i++){
            System.out.println(mat_hang[i].toString());
        }
        sc.close();
    }
}
