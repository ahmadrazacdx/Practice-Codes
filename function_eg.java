package Practice;
import java.util.Scanner;

public class function_eg {

    public static String fn,ln,a,id;
    public static int r,b,rn;
    public static void id(String fn, String ln)
    {
        id=fn+ln;
            System.out.println("Name:"+id);
        }
    public static void id(int r)
    {
        rn=r;
            System.out.println("Roll Number:"+rn);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name:");
        a= sc.nextLine();
        System.out.println("Enter Your Roll Number:");
        b=sc.nextInt();
        id(a,a);
        id(b);
    }
}
