package employeesalary;

import java.util.Scanner;
public class EmployeeSalary {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int hour;
        int overTime;
        double normalRate = 35.00;
        double normalPay;
        double overtimePay;
        double totalPay;
        
        System.out.print("Enter Worked Hours: ");
        hour = scan.nextInt();
        
        System.out.println("");
        
        if (hour > 40){
            overTime = hour - 40;
            overtimePay = overTime * (normalRate * 1.5);
            normalPay = 40 * normalRate;
            totalPay = overtimePay + normalPay;
                    
            System.out.println("Normal Pay: ₱" + normalPay);
            System.out.println("Overtime Pay: ₱" + overtimePay);
            System.out.println("Total Pay: ₱" + totalPay);
        } else {
            normalPay = hour * normalRate;
            overtimePay = 0;
            totalPay = overtimePay + normalPay;
            
            System.out.println("Normal Pay: ₱" + normalPay);
            System.out.println("Overtime Pay: ₱" + overtimePay);
            System.out.println("Total Pay: ₱" + totalPay);
        }
        
    }
    
}
