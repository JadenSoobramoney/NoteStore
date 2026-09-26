/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.note_store;
import java.util.Scanner;
/**
 *
 * @author sandy
 */
public class NOTE_STORE {// generallyuseful code may be here too

    public static void main(String[] args) {
        System.out.println("Check the class files for the code by type ;D");
                
// friendly reminder, u can just remove the functions parts and rename variables to code integrate
//, I know you probably know
// but Test pressure can make people do silly things,
// espescially me -w-*
//You can do it >w<--'o   
    }
    
    public static void CallScanner(){
    Scanner input = new Scanner(System.in);
    
    // To call scanner for string
    String ExStr=input.nextLine();
    
    //To call scanner for int (Probably DO NOT USE nextint, it's bugged & will skip the next input)
    int ExInt= Integer.parseInt(input.nextLine());   
    
    // For safety other numbers may be bugged aswell so use the parse command 
    double ExDouble= Double.parseDouble(input.nextLine());
    }
    
    
  public static void CallClass(){
        // Call Constructor    
        class_ParentClass A = new class_ParentClass("A", 0); 
        
    class_ChildClass B= new class_ChildClass("B", 0, "AddedVar"); //NOT related TO A
// Call methods
A.SetB();
    A.AddNumber(1);
A.Display();

    B.SetB();
B.Display();
   // Call procedure 
   String Name= A.GetName();
    }
public static void CreateClass(){
// Apologies this one was a little annoying to make an example so I included IVehicle dealer to show it
// Shows class create via abstract classes in iVehicleDealer

}
public void StringManipulation(){
String Check= "INItialIZE";
char a = Character.toLowerCase(Check.charAt(0)); // return i


}



}



