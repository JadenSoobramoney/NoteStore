/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;

/**
 *
 * @author sandy
 */ //ABSTRACT keyword 

public class class_ChildClass extends class_ParentClass{
   protected String AddedVar;
    
   
// Call Super() to create superclass and child class
    public class_ChildClass(String UserName,int Num, String AddedVar){
        super(UserName,Num);
        // similar to constructor in class_ParentClass 
//E.G using this. too:
        this.AddedVar=AddedVar; //advisable not to use this. too much
    }
    
    
@Override // does not need to be abstract to be overrided
public void Define(){
//Add method stuff to the abstract class
System.out.print("Defined");
};
@Override
public void Display(){
System.out.println(""+ name);
System.out.println(""+ Number);
System.out.println(""+ TruFalse);
System.out.println(""+ AddedVar);
}
// Create for abstract class
public void create(String AddVar){
    // Traits of created parents are Auto inhereted when abstract
    AddedVar= AddVar;}  
}
