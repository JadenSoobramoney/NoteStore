/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.note_store;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
// [INCLUDED IN ABSTRACT folder]
}
public void StringManipulation(){
String Check= "INItialIZE";
char a = Character.toLowerCase(Check.charAt(0)); // return i

// COPY
//COPY RANGE
String HI= "H"+ Check.substring(0, 1); // Returns HI ((included),(excluded))

//COPY FROM
String Full= Check.substring(4); // return ialIZE 
}

public void NestSkeleton(){
// replace 1 with a value / probs array.length
for(int i=0;i<1;i++ ){
   
for (int j=0; j<1;j++){


}

}
}
public void CaseSkeleton(){
    Scanner input = new Scanner(System.in);
 int i = Integer.parseInt(input.nextLine());
 
 switch(i){ 
     case 1:
         // First case
         break;
      case 2:
         // Second case
         break;
      default:
          // if no valid given
          break;
 }
 
 // ALSO READS STRING so switch(string)
 // case "x":
}


public void WhileSkeleton(){
    
// use to make repeating GUI in the case of incorrect input// just here as a go to~
int CheckSum=0; // declare or assign
while(CheckSum<1){
// process

// IF Else skeleton too
if(true){CheckSum=1; // break when condtion
}
else{
    System.out.println("Error, please try again"); // usually more descriptive
}

}
// end of while
}


}


