import java.util.*;
class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toString(){
        return getHour() + " " + getMinute() + " " + getSecond();
    }
}
public class J05033_sap_xep_tgian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Time[] times = new Time[t]; 
        for(int i = 0; i < t; i++){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            times[i] = new Time(hour, minute, second);
        }
        Arrays.sort(times, new Comparator<Time>() {
            @Override
            public int compare(Time t1, Time t2){
                if(t1.getHour() != t2.getHour()){
                    return Integer.compare(t1.getHour(), t2.getHour());
                }
                else{
                    if(t1.getMinute() != t2.getMinute()){
                        return Integer.compare(t1.getMinute(), t2.getMinute());
                    }
                    else{
                        return Integer.compare(t1.getSecond(), t2.getSecond());
                    }
                }
            }
        });

        for(int i = 0; i < t; i++){
            System.out.println(times[i].toString());
        }
        sc.close();
    }
}
