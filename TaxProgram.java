import java.util.Scanner;

public class TaxProgram {
    public static void main(String[] args) {

        double income, fedTax, provTax;
        int dependents;


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your taxable income: ");
        income = input.nextDouble();
        System.out.println();

        /*System.out.println("Please enter your number of dependents: ");
        dependents = input.nextInt();
        System.out.println();*/

        fedTax = 0.0;
        provTax = 0.0;

        if(income <= 29590){
            fedTax = income * 17/100;
            System.out.println(fedTax);

        }else if((income <= 29590.1) && (income <= 59179.99)){
            fedTax = 17/100 * 29590 + ( 26/100 * (income - 29590));
            System.out.println(fedTax);
        }else if(income >= 59180){
            fedTax = ((17 / 100) * 29590) + (26/100 * 29590) + (29/100 * (income - 59180));
            System.out.println(fedTax);
        }

    }
}
