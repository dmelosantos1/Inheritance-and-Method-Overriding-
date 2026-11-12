import java.util.Scanner;

class Employee{
    double calculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        return basePay+bonus;
    }
}

class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
    @Override
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee type (full-time / part-time): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("full-time")){
            FullTimeEmployee ft = new FullTimeEmployee();

            System.out.print("Enter base pay: ");
            ft.basePay=scanner.nextDouble();

            System.out.print("Enter bonus: ");
            ft.bonus=scanner.nextDouble();

            System.out.println("Monthly Salary: " + ft.calculateSalary());
        }
        else if (type.equalsIgnoreCase("part-time")){
            PartTimeEmployee pt = new PartTimeEmployee();

            System.out.print("Enter hourly rate: ");
            pt.hourlyRate = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            pt.hoursWorked = scanner.nextDouble();

            System.out.println("Monthly Salary: "+ pt.calculateSalary());
        }

        else{
            System.out.println("Invalid Employee Type.");
        }
        scanner.close();
    }
}

