package edu.elac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-15 15:56
 */
public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJoinOfYear() {
        return joinOfYear;
    }

    public void setJoinOfYear(int joinOfYear) {
        this.joinOfYear = joinOfYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int id;
    private String name;
    private int joinOfYear;

    private double salary;


    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee p1 = new Employee();
        p1.setId(1);
        p1.setName("P1");
        p1.setJoinOfYear(2020);
        p1.setSalary(3000);

        Employee p2 = new Employee();
        p2.setId(2);
        p2.setName("P2");
        p2.setJoinOfYear(2021);
        p2.setSalary(5000);

        Employee p3 = new Employee();
        p3.setId(3);
        p3.setName("P3");
        p3.setJoinOfYear(2023);
        p3.setSalary(1000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        List<Employee> listsorted = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(
                Collectors.toList());
        System.out.println(listsorted.get(0).getName());

    }

}