package ru.gb.lsn3;

import java.time.LocalDate;
import java.util.Date;

/** Класс Employee
 *
 */
public class Employee {

 private static final int CURRENT_YEAR = 2024;
 String name;
 String midName;
 String surName;
 String position;
 String phone;
 LocalDate birthDate;
 int salary;
 int birth;

         public Employee(String name, String midName, String surName,
 String phone, String position, int salary, int birth, LocalDate  birthDate) {
             this.name = name;
             this.midName = midName;
             this.surName = surName;
             this.position = position;
             this.phone = phone;
             this.salary = salary;
             this.birth = birth;
             this.birthDate = birthDate;
             }

         public String getName() {

             return name;
             }

         public String getMidName() {
             return midName;
             }

         public String getSurName() {
             return surName;
            }

         public String getPosition() {
             return position;
             }

         public void setPosition(String position) {
             this.position = position;
             }

         public String getPhone() {
             return phone;
             }

         public void setPhone(String phone) {
             this.phone = phone;
             }

         public int getSalary() {
             return salary;
             }

         public int getAge() {
             return CURRENT_YEAR - birth;
             }

    public LocalDate  getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate  birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Employee{" +
                "firstName='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", birthDate='" + birthDate + '\'' + '}';
    }
}

