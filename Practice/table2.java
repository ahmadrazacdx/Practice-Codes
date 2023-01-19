package Practice;
import java.util.Scanner;
class table2 {
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number:");
            int num=sc.nextInt();
             // System.out.print("Enter range: ");
            // int range=sc.nextInt();
            int i = 1;
            while (i <= 10)
            {
                System.out.println(num + " * " + i + " = "+ num * i);
                i++;
            }
        }
    }
