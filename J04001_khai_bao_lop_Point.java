import java.util.*;
class Point{
    private double x;
    private double y;

    public Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    } 
}
public class J04001_khai_bao_lop_Point {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            double distance = p1.distance(p2);
            System.out.printf("%.4f", distance);
            System.out.print("\n");
            
        }
        sc.close();
    }
}
