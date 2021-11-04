package interfaces_abstract_lecture;

import java.util.Properties;

abstract class Employee implements DailyWork {
    protected String name;
    protected String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;

    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

//    public abstract String work();
//      ^ commented out and Implemented DailyWork
    public static void main(String[] args) {
        // can not instantiate an abstract class *cte - compile time error*
        // Employee mcDez = new Employee("Dez", "web dev");
            }
        }
