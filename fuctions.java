package Practice;
import java.util.Scanner;
public class fuctions {
    static double a,b,n1,n2,sum,diff,mul,div;
    public static void sum(double a,double b)
    {
        sum=a+b;
        System.out.println("Sum is:"+sum);
    }
    public static void diff(double a,double b)
    {
        diff=a-b;
        System.out.println("Difference is:"+diff);
    }
    public static void div(double a,double b)
    {
        div=(a)/(b);
        System.out.println("Result of division is:"+div);
    }
    public static void mul(double a,double b)
    {
        mul=a*b;
        System.out.println("Result of multiplication is:"+mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit:");
        n1=sc.nextInt();
        System.out.println("Enter second digit:");
        n2= sc.nextInt();
        sum(n1,n2);
        diff(n1,n2);
        div(n1,n2);
        mul(n1,n2);

    }
}
