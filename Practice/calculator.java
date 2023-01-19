package Practice;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Digit:");
        a = sc.nextInt();
        System.out.println("Enter Second Digit:");
        b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int dividion= a/b;
        if(a%b==0) System.out.println("b is multiply of a.");
        if(b%a==0) System.out.println("a is multiply of b.");
        if((a%2)==0) System.out.println("a is even number.");
        if((a%2)!=0) System.out.println("a is odd number.");
        if((b%2)==0) System.out.println("b is even number.");
        if((b%2)!=0) System.out.println("b is odd number.");
        System.out.println("Sum is :" + sum);
        System.out.println("Diff is :" + diff);
        System.out.println("Product is :" + prod);
        System.out.println("Result of Division is :" + dividion);
    }
}
