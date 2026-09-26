/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ivehicledealer;

/**
 *
 * @author sandy
 */
abstract class Employee {
    protected static String EmployeeID,Name;
    protected static double baseSalary;
    
    public static void create(String EmID, String Emp, Double Base){
        EmployeeID=EmID;
        Name=Emp;
        baseSalary=Base;    
    }
    abstract double CalculateCommision();
}
