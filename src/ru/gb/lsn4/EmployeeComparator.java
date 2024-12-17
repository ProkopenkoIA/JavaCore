package ru.gb.lsn4;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
