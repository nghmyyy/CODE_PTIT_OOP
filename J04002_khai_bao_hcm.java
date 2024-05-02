import java.util.*;
class Rectange{
    private double width;
    private double height;
    private String color;
    public Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        color = color.toLowerCase();
        return String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return height * width;
    }
    public double findPerimeter(){
        return (height + width) * 2;
    }
}
public class J04002_khai_bao_hcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String color = sc.next();
        if(w <= 0 || h <= 0){
            System.out.println("INVALID");
        }
        else{
            Rectange hcn = new Rectange(w, h, color);
            System.out.println((int) hcn.findPerimeter() + " " + (int) hcn.findArea() + " " + hcn.getColor());
        }
        sc.close();
    }
}
