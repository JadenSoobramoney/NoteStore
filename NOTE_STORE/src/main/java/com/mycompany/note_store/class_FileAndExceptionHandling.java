/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author sandy
 */
public class class_FileAndExceptionHandling {
    public void BasicTryCatchSkel(){
    try{
        
    }
    catch(Exception e){}
    
    // Exception Types:
    //ArithmeticException, NullPointerException (no value),IOException, ArrayOutofBoundsException
    //FileNotFoundException
    }
        public void TryCatchFINSkel(){
    try{
        
    }
    catch(Exception e){
    
    }
    finally{
                
        }
        
        }
        
public void FileRead(){
    
    try{
      File FileName = new File("Example.txt");  
      Scanner Read = new Scanner(FileName);
      
      while(Read.hasNextLine()){
      String Data = Read.nextLine();
      
      // TO DIsplay:
          System.out.println(Data);
      }
      
    }
    catch(FileNotFoundException e){System.out.println("Error: File Not Found");}
    
    }
public void Write(){

    try{
    FileWriter OUTfile = new FileWriter("AccountStoreOut.txt");
OUTfile.write("Hiii"); // write a line
OUTfile.close();


OUTfile.append("How Are You~?"); // Addd a line
OUTfile.close();// to save
    }
    catch(Exception e){}






}

public void MultiException(){
 try{// Nest try in the case of checking for multiple exceptions
    try{
      File FileName = new File("Example.txt");  
      Scanner Read = new Scanner(FileName);
      
      while(Read.hasNextLine()){
      String Data = Read.nextLine();
      
      // TO DIsplay:
          System.out.println(Data);
      }
      
    }
    catch(FileNotFoundException e){System.out.println("Error: File Not Found");}
    
    }catch(Exception e){System.out.println("Something went wrong");}
}





}
// EXAMPLE OF CUSTOM EXCEPTION// pput in sep class file
class IncorrectinputException extends Exception {
    public IncorrectinputException(String m) {
        super(m);
    }
}
  

