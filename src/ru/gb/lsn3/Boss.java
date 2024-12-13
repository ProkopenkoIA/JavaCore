package ru.gb.lsn3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Boss extends Employee {
    public Boss(String name, String midName, String surName, String phone, String position, int salary, int birth, LocalDate birthDate) {
        super(name, midName, surName, phone, position, salary, birth, birthDate);
    }

    public static void setSalary(int salary, List<Employee> emlp) {
        for (Employee e:emlp) {
            if (!(e instanceof Boss)) {
                e.salary = salary;
            }
        }
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getMidName() {
        return super.getMidName();
    }

    @Override
    public String getSurName() {
        return super.getSurName();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
