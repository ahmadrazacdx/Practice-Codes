package Practice;

import java.util.Scanner;
class Table1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        for(int d=1; d <= 10; d++)
        {
            System.out.println(num+" x "+d+" = "+num*d);
        }
    }
}
