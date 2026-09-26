/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;

/**
 *
 * @author sandy
 */
public class class_1dArray {
     //1D array
//Arr= array name

    
//String Display
public void ArDisp(String[] Arr){ 
System.out.println("========== ==========="); 
    
for (int i=0;i<Arr.length;i++){
    System.out.println("\t"+ Arr[i]);
}   
}
//int + sum Display // data type can be changed to number double or float for decimals
//Remember to add Display data
public void ArDisp(int[] Arr){ 
System.out.println("========== ==========="); 
int Sum=0;             
for (int i=0;i<Arr.length;i++){
    System.out.println("\t"+ Arr[i]); 
    Sum=Sum+Arr[i];
}   
System.out.println("Total:\t"+ Sum/Arr.length);
}
    
// AGGREGATION FUNCTIONS
    //Sum of integers in an array
public void ArSum(int[] Arr){ 
int Sum=0;
for (int i=0;i<Arr.length;i++){
Sum=Sum+Arr[i];
}
System.out.println("Total:\t"+ Sum);
}
// Average of array
public void Ave(int[] Arr){
int Sum=0;
for (int i=0;i<Arr.length;i++){
Sum=Sum+Arr[i];
}
    System.out.println("Average:\t"+ Sum/Arr.length);
}
    
    
    
// SORT FUNCTIONS     
    //InsertSort for integers
    public void InserSort(int[] arrNum){
              int i,j;  
      int len = arrNum.length;
        
        for (i=0;i<(len-1);i++ ){
        for (j=i+1;j<(len);j++ ){
            
            if (arrNum[i]>arrNum[j]){
            int Temp = arrNum[j];
            arrNum[j]=arrNum[i];
            arrNum[i]=Temp;
            }
        }
        }   
    
}
    //Insert sort Alphabetically
    public void InserSort(String[] arrNum){
              int i,j,dex;  
      int len = arrNum.length;
        
        for (i=0;i<(len-2);i++ ){
        
        for (j=i+1;j<len-1;j++ ){
           if(arrNum[i] != arrNum[j]){ // Checks to ensure data is not identical
           dex=0;  // Index check  
           
          while (dex< arrNum[i].length() && dex< arrNum[i].length()){ // while index less than length of words
           char Ichar,Jchar;
           Ichar=(arrNum[i].charAt(dex));
           Jchar=arrNum[j].charAt(dex);
     Ichar= Character.toUpperCase(Ichar);
     Jchar= Character.toUpperCase(Jchar);
             
           if (Ichar>Jchar){// ASCII
            String Temp = arrNum[j];
            arrNum[j]=arrNum[i];
            arrNum[i]=Temp;
            break;
           }
           
           dex=dex+1; // next index
            }
          
          if (dex>arrNum[j].length()){ // Swap Variables
          String Temp = arrNum[j];
            arrNum[j]=arrNum[i];
            arrNum[i]=Temp;
          }
           
           }
           
            }
        }// end of all for loops
    
    } // end of function
public void ArSearch(String Name){
String[] ArrayToSearch= new String[20];// initialize for example NOT NEEDED

boolean found;

for(int i=0;i< ArrayToSearch.length;i++){
    
if (Name== ArrayToSearch[i]){
found =true;
break;
}
}

if (found=true){
//
}
else
{System.out.println(Name+"was not found");}

}   
    
    
    
    // Bubble sort, probably only use if asked cos this sort kinda sucks (sorry abt the rant TwT*)
public void bubbleSort(int[] arrNum) {
    int n = arrNum.length;
    boolean swapped;
  
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arrNum[j] > arrNum[j + 1]) {
                
                int temp=arrNum[j];
                arrNum[j]=arrNum[j + 1] ;
                arrNum[j + 1]=temp;
               
                swapped = true;
            }
        }
      
        // If no two elements were swapped, then break
        if (!swapped){
            break;}
    }
} // end of bubble sort
    
}
