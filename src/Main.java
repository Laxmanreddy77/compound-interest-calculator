//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount : ");
        principal = sc.nextDouble();

        System.out.println("Enter the interest rate (in %) ");
        rate=sc.nextDouble()/100;

        System.out.println("Enter the # of times compound per year : ");
        timesCompounded=sc.nextInt();

        System.out.println("Enter the # of year");
        years=sc.nextInt();

        amount=principal * Math.pow(1+rate/timesCompounded,timesCompounded*years);

        System.out.println("The amount after "+years+" is: $"+amount);

        sc.close();

    }
}