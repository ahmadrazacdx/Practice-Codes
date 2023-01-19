package Practice;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius=sc.nextInt();
        double Pi=3.14;
        double area=Pi*(radius*radius);
        double circumference=2*Pi*radius;
        double diameter=2*radius;
        double quadrant=(Pi*radius)/2 +2*(radius);
        double semicrcle=(Pi*radius)+2*radius;
        System.out.println("Area of circle is:"+area);
        System.out.println("Circumference of circle is:"+circumference);
        System.out.println("Diameter of circle is:"+diameter);
        System.out.println("Quadrant is:"+quadrant);
        System.out.println("Semicircle is:"+semicrcle);
    }
}
