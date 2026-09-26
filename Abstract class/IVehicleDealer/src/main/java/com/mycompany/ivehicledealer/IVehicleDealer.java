/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ivehicledealer;
import java.util.Scanner;
/**
 *
 * @author Jaden
 */
public class IVehicleDealer {

    public static void main(String[] args) {
        generateQuote();
    }
    
    
    public static void generateQuote(){
        int VS, ComP;
        String EmployeeID,Name;
   double Cash;
        
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter Agent name"); 
        Name= input.nextLine();
        System.out.println("Please enter Employee ID");
        EmployeeID= input.nextLine();
        System.out.println("Please enter Employee base salary");
        Cash= Double.parseDouble(input.nextLine());
        
        Employee.create(EmployeeID, Name, Cash);
        
        
        System.out.println("Please enter vehicles sold ");
        VS= Integer.parseInt(input.nextLine());
        System.out.println("Please enter Commission rate(%)");
        ComP= Integer.parseInt(input.nextLine());
        System.out.println("Please enter Total earnings");
        Cash= Double.parseDouble(input.nextLine());
        SalesAgent.create(VS, ComP, Cash);
        System.out.println(SalesAgent.PrintReport());
        
    }
}
