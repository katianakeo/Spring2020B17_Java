package day03_VariablesContinue;

public class SalaryCalculator {
    /* rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD

     */
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;

        // salary = rate*weeklyHour*4*12
        double salary = rate*weeklyHours*52;

        // stateTax = salary*stateTax
        double stateTax = salary*stateTaxRate;

        //FederalTax = salary*federalTaxRate
        double federalTax = salary*federalTaxRate;

        // income after tax = salary-(stateTax+federalTax)
        double incomeAfterTax = salary-(stateTaxRate+federalTaxRate);

        System.out.println("Your Salary is: "+salary);
        System.out.println("Your total tax is: "+(stateTax+federalTax));
        System.out.println("Your state tax is: "+stateTax); // state tax is 4575
        System.out.println("Your federal tax is: "+federalTax); // 25167
        System.out.println("Your income is: "+incomeAfterTax);
















    }


}
