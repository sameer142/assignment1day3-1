package assignment.problems.java;

public class DailyEmployeeWage {

    public void employeeWage() {
        int hour = 8;
        int wage = 20;
        System.out.println("Daily Wage of Employee: "+(hour*wage));
    }

    public static void main(String[] args) {

        DailyEmployeeWage employee = new DailyEmployeeWage();
        employee.employeeWage();
    }


}
