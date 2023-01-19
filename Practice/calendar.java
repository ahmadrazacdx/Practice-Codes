package Practice;
import java.util.Scanner;
public class calendar {
    public static void main(String[] args) {
        String a= ("January");
        String b= ("February");
        String c= ("March");
        String d= ("April");
        String e= ("May");
        String f= ("June");
        String g= ("July");
        String h= ("August");
        String i= ("September");
        String j= ("October");
        String k= ("November");
        String l= ("December");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of month:");
        int num= sc.nextInt();
        if(num==1) System.out.println("Name of month is:"+a);
        if(num==2) System.out.println("Name of month is:"+b);
        if(num==3) System.out.println("Name of month is:"+c);
        if(num==4) System.out.println("Name of month is:"+d);
        if(num==5) System.out.println("Name of month is:"+e);
        if(num==6) System.out.println("Name of month is:"+f);
        if(num==7) System.out.println("Name of month is:"+g);
        if(num==8) System.out.println("Name of month is:"+h);
        if(num==9) System.out.println("Name of month is:"+i);
        if(num==10) System.out.println("Name of month is:"+j);
        if(num==11) System.out.println("Name of month is:"+k);
        if(num==12) System.out.println("Name of month is:"+l);
    }
}
