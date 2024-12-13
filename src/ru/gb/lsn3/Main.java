package ru.gb.lsn3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Инванов","Иван","Иванович","369874","Рабочий",1,20, LocalDate.parse("2014-01-01"));
        Employee emp2 = new Employee("Петров","Иван","Иванович","369875","Рабочий",1,20, LocalDate.parse("2013-01-01"));
        Employee emp3 = new Employee("Сидоров","Иван","Иванович","369876","Рабочий",1,20, LocalDate.parse("2010-01-01"));
        Boss boss1 = new Boss("Потапов","Сергей","Иванович","111111","Директор",1000,20, LocalDate.parse("1980-01-01"));

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(boss1);

        Comparator speedComparator = new EmployeeComparator();
        Collections.sort(employeeList, speedComparator);

        System.out.println(employeeList);

        boss1.setSalary(10, employeeList);

        System.out.println(employeeList);



    }
}
