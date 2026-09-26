/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ivehicledealer;

/**
 *
 * @author sandy
 */
abstract class SalesAgent extends Employee {
    protected static int VehiclesSold, commsionRate;
    protected static Double  Total;
    //@override
    
    public static void create(int VS, int ComP,Double Tot){
            VehiclesSold=VS;
            commsionRate=ComP;
            Total=Tot;
    }   
    @Override
    public double CalculateCommision(){
        return (Total-baseSalary);}
public static String PrintReport(){
    String Rep=" ";
Rep="\n\nEmployee Report\n========================";
Rep=Rep+"\nAgent name:\t"+Name;
Rep=Rep+"\nID:\t"+EmployeeID;
Rep=Rep+"\nbase salary:\t"+baseSalary;
Rep=Rep+"\nvehicles sold:\t"+ VehiclesSold;
Rep=Rep+"\ntotal earnings:\t"+ Total;
if ((Total-baseSalary)>10000){
Rep=Rep+"\n\nTop Seller!";}




return Rep;}
    
}
