package assignment.problems.java;

public class PartTimeEmployee {

    public void employeeWage1() {
        int wage = 20;
        int hour = 8;
        System.out.println(" Part time  Wage of  an Employee: "+(hour*wage));
    }

    public static void main(String[] args) {

        PartTimeEmployee employee = new PartTimeEmployee();
        employee.employeeWage1();
    }
}