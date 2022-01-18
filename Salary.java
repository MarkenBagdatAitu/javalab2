package com.company;

public class Salary {
    public String name;
    private double base;
    private int hours;

    public Salary(String name, double base, int hours){
        this.name=name;
        this.base = base < 8 ? 8 : base;
        setHours(hours);
    }

    public void info(){
        System.out.println(name+" "+base+" "+hours);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getBase() {return base;}

    public void setBase(double base) {this.base = base;}

    public int getHours() {return hours;}

    public void setHours(int hours) {this.hours = hours;}


    public double calculateSalary() {
        double overTime = 0;
        double grossSalary;
        if (hours < 40) {
            hours = 40; // если время часов меньше 40 выводим его как 40
        } else if (hours > 40 && hours <= 60) { // если больше 40 и меньше или равно 60
            overTime = (hours-40) * (base * 1.5); // то отнимаем 40 и умножаем на 1.5
        } else if(hours>60){ // если больше 60 то приравниваем
            hours=60;
            overTime = (hours-40) * (1.5 * base);
        }
        grossSalary = hours * base;
        grossSalary += overTime;
        return grossSalary;
    }
}