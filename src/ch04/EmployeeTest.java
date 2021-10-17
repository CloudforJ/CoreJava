package ch04;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("zhangsan", 20000, 2017, 10, 22);
        staff[1] = new Employee("lisi", 25000, 2020, 10, 1);
        staff[2] = new Employee("wangwu", 30000, 2020, 8, 11);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() +
                    ", hireDay = " + e.getHireday());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireday = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
