package ru.gb.lsn4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
enum Parties{NONE, NEW_YEAR, MARCH_8, FEB_23};


public class Main {
    private static final Parties today = Parties.NONE;
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Инванов","Иван","Иванович","369874","Рабочий",1,20, LocalDate.parse("2014-01-01"),Genders.MALE);
        Employee emp2 = new Employee("Петров","Иван","Иванович","369875","Рабочий",1,20, LocalDate.parse("2013-01-01"),Genders.MALE);
        Employee emp3 = new Employee("Сидоров","Иван","Иванович","369876","Рабочий",1,20, LocalDate.parse("2010-01-01"),Genders.MALE);
        Boss boss1 = new Boss("Потапов","Сергей","Иванович","111111","Директор",1000,20, LocalDate.parse("1980-01-01"),Genders.MALE);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(boss1);

        Comparator speedComparator = new EmployeeComparator();
        Collections.sort(employeeList, speedComparator);

        System.out.println(employeeList);

        boss1.setSalary(10, employeeList);

        System.out.println(employeeList);

        celebrate(employeeList.toArray(new Employee[employeeList.size()]));

    }
    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].name + ", happy New Year!");
                    break;
                case FEB_23:
                    if (emp[i].gender == Genders.MALE)
                        System.out.println(emp[i].name + ", happy February 23rd!");
                    break;
                case MARCH_8:
                    if (emp[i].gender == Genders.FEMALE)
                        System.out.println(emp[i].name + ", happy march 8th!");
                    break;
                default:
                    System.out.println(emp[i].name + ", celebrate this morning!");
                    }
            }
        }

}
