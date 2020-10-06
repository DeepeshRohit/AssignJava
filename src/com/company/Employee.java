package com.company;


public class Employee {
    private String name;
    private int id;
    private double monthlyBasic;
    private float pfRate ;



    public Employee(String name, int id, double monthlyBasic,float pfRate) {
        super();
        this.name = name;
        this.id = id;
        this.monthlyBasic = monthlyBasic;
        this.pfRate = pfRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlyBasic() {
        return monthlyBasic;

    }

    public void setMonthlyBasic(double monthlyBasic) {
        this.monthlyBasic = monthlyBasic;
    }

    public double getAnnualBasic() {
        return 12 * monthlyBasic;
    }

    public double getMonthlyGrossSalary() {
        double hra = monthlyBasic / 2;
        double medicalAllowance = 1250;
        double conveyanceAllowance = 800;

        return monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
    }

    public double getAnnualGrossSalary() {
        return 12 * getMonthlyGrossSalary();
    }

    public double getMonthlyDeductions() {
        double pf = Math.min((pfRate / 100) * monthlyBasic, 6500);
        double esic = monthlyBasic <= 5000 ? (4.75 / 100) * monthlyBasic : 0;
        double profTax = getMonthlyGrossSalary() <= 10000 ? 50 : 100;

        return pf + esic + profTax;
    }

    public float getPfRate() {
        return pfRate;
    }

    public void setPfRate(float pfRate) {
        this.pfRate = pfRate;
    }

    public double getMonthlyTakeHome() {
        return getMonthlyGrossSalary() - getMonthlyDeductions();
    }

    public double getAnnualTakeHome() {
        return 12 * getMonthlyTakeHome();
    }
}
