import java.util.*;
import java.lang.Math;
class Point_1{
    private double x;
    private double y;

    public Point_1(){}
    public Point_1(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point_1(Point_1 p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point_1 secondPoint){
        return Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
    }
    public static double distance(Point_1 p1, Point_1 p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    } 
}
public class J04008_chu_vi_tam_giac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            Point_1[] point = new Point_1[3];
            for(int i = 0; i <= 2; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                point[i] = new Point_1(x,y);
            }
            /* if((point[0].getX() == point[1].getX() && point[1].getX() == point[2].getX()) || (point[0].getY() == point[1].getY() && point[1].getY() == point[2].getY())){
                System.out.println("INVALID");
            }
            else{
            */
                double ds1 = Point_1.distance(point[0], point[1]);
                double ds2 = Point_1.distance(point[0], point[2]);
                double ds3 = Point_1.distance(point[2], point[1]);
                if(ds1 + ds2 <= ds3  || ds1 + ds3 <= ds2 || ds2 + ds3 <= ds1){
                    System.out.println("INVALID");
                }
                else{
                    System.out.printf("%.3f", ds1 + ds2 + ds3);
                    System.out.print("\n");
                }
            //}
            t--;
        }
        sc.close();
    }
}
