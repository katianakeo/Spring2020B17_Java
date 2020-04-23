package day02_variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        byte rate = 55;
        double stateTax = 0.04;
        double federalTax = 0.22;
        byte weeklyHours = 40;
        int salaryYear = rate * weeklyHours *4 *12;
        double stateTaxYear = salaryYear * stateTax;
        double federalTaxYear = salaryYear * federalTax;
        double totalTaxYear = stateTaxYear + federalTaxYear;
        double income = salaryYear - totalTaxYear;









    }


}
