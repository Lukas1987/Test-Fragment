package sk.itsovy.mati.projectfragment;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Year;
import java.util.Scanner;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code) { // čiastka, retazovka
        //doplnit kod // decimalp
        /*kurzy dajte priblizne s presnostou na 2 desatinne miesta
        metoda bude konvertovat EUR na tieto meny: TRY, HUF, CHF, HRK, GBP
        ak kod bude iny, metoda vrati -1 */
        double amount, lyre, forint, frank, kuna, point, euro;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("1: Euro; t2: Lyre; t3: Forint; t4: Frank; t5: Kuna; t6: Point");
        code = sc.nextInt();
        System.out.println("How much Money you want to convert?");
        amount = sc.nextFloat();

        if(code == 1){
            lyre = amount /6,44;
            System.out.println("Your " + amount + "Euro is : " + f.format(lyre) + "Lyre");
            forint = amount /330,62;
            System.out.println("Your " + amount + "Euro is : " + f.format(forint) + "Forint");
            frank = amount /1,1;
            System.out.println("Your " + amount + "Euro is : " + f.format(frank) + "Frank");
            kuna = amount /7,44;
            System.out.println("Your " + amount + "Euro is : " + f.format(kuna) + "Kuna");
            point = amount /0,86;
            System.out.println("Your " + amount + "Euro is : " + f.format(point) + "Point");
         } else {
            System.out.println("Invalid input");
        }

    }
    /* convert (120,"CHF")  vrati vysledok 191.95
    convert (520,"USD")  vrati vysledok -1 */

    /*public static double loan(double value, double interest, int month){
        /*  doplnit kod */
    public static double calcMontlyPayment(int loanAmount, int termInYears, double interestRate){
        interestRate = 100;
        double monthlyRate = interestRate / 12;
        int termInMonths = termInYears *12;
        double monthlyPayment = (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));
        return monthlyPayment;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount: ");
        int loanAmount = scanner.nextInt(); // výška pôžičky

        System.out.println("Enter loan term (in years): ");
        int termInYears = scanner.nextInt(); // obdobie v rokoch

        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble(); // urokova sadzba

        double monthlyPayment = calcMontlyPayment(int loadAmount, termInYear, interestRate); //calcMonthlyPayment(loanAmount, termInYears, interestRate);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat = NumberFormat.getPercentInstance();

        System.out.println("Loan Amount: " + currencyFormat.format(loanAmount));
        System.out.println("Loan Term: "+ termInYears+" years");
        System.out.println("Interest Rate: "+ interestFormat.format(interestRate));
        System.out.println("Monthly Payment: "+ currencyFormat.format(monthlyPayment));
    }
    /* loan(1000, 4.5 , 20 ) vrati 52.25
    loan(6000, 2.8 , -36) vrati -1 */
    static double getPosNumber(String prompt){ //ziskať číslo
        double val; //hodnota
        do {
            System.out.println(prompt);
            val = sc.nextDouble();
            if(val <= 0)
                System.out.println("You must enter a possitive number");
        } while (val <= 0);
        return (-1);
    }
}
