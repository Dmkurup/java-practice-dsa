package com.codewithmosh;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int noOfEmployees;

    public static void printNoOfEmployees(){
        System.out.println(noOfEmployees);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        noOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary<=0){
            throw  new IllegalArgumentException("Salary cannot be null or negative");
        }
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }



    public int calculateWage(int extraHours){
        return baseSalary+(extraHours*hourlyRate);
    }
    public int calculateWage(){
        return calculateWage(0);
    }
}
