/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;

/**
 *
 * @author sandy
 *///ABSTRACT keyword not needed unless asked

public class class_ParentClass {
   protected int Number;
   protected String name;
   protected boolean TruFalse;



// Constructor  

public class_ParentClass(String UserName,int Num){
// Assign input    
Number=Num;
name=UserName;

//Initialize Generate or Randomize varaibles
TruFalse=false;
}
   
//Accessor method format:// public DataType MethcodName(){return variable}
public  String GetName(){
return name;
} 
// Mutator method
public void AddNumber(int Addition){
Number=Number+ Addition;}  

// Setter Method
public void SetB(){
TruFalse= true;
}
// 
public void SetN(int Num){
Number=Num;
}
public void Define(){
//Abstract procedure declaration
//abstract void Define();
// add abstract keyword to class name after public, abstract classes cannot be made using ClassName()/Constructor
}
public void Display(){
System.out.println(""+ name);
System.out.println(""+ Number);
System.out.println(""+ TruFalse);
}

// Create (Use as an alternative to the constructor for abstract class)// example in iVehicleDealer
public void create(String UserName,int Num){
Number=Num;
name=UserName;
TruFalse=true;
}

}
