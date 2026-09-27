/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;

/**
 *
 * @author sandy
 */
public class class_2dArray {
    
    public static String ColRowDisp(int[][] ArrInput){// DISPLAY ROW AND COLUMN TOTAL 
    String Final="";
        int[] ArrColSum=new int[ArrInput[1].length]; // Array of totals
        
        int FinTot=0;
        
        for (int Set =0;Set<ArrColSum.length;Set++){
        ArrColSum[Set]=0;
        }
        for (int i =0;i<ArrInput.length;i++){
                int Sum=0;
                Final=Final+("\n"+"A"+"\t"); // ADD LABEL usee array[i] if possible
                
                
            for (int j =0;j<ArrInput[1].length;j++){
                Final=Final+("\t" +ArrInput[i][j]);
                Sum=Sum+ArrInput[i][j];
                ArrColSum[j]=ArrColSum[j]+ArrInput[i][j];
            } 
            Final=Final+("\t"+ Sum);
            FinTot=FinTot+Sum;
            }
        
        // TOTAL DISPLAY BLOCK
        Final=Final+("\n---------------------------------------------------------------");
                Final=Final+("\nTOTAL    \t\t");
            
            for (int Week =0;Week<ArrColSum.length;Week++){ Final=Final+(ArrColSum[Week]+"\t");
            }
            Final=Final+FinTot;
                       

            
            return Final;
    }
public static String ColDisp(int[][] ArrInput){ // DISPLAY column TOTAL ONLY
    String Final="";
        int[] ArrColSum=new int[ArrInput[1].length]; // Array of totals
        
        int FinTot=0;
        
        for (int Set =0;Set<ArrColSum.length;Set++){
        ArrColSum[Set]=0;
        }
        for (int i =0;i<ArrInput.length;i++){
                int Sum=0;
                Final=Final+("\n"+"A"+"\t"); // ADD LABEL usee array[i] if possible
                
                
            for (int j =0;j<ArrInput[1].length;j++){
                Final=Final+("\t" +ArrInput[i][j]);
                Sum=Sum+ArrInput[i][j];
                ArrColSum[j]=ArrColSum[j]+ArrInput[i][j];
            } 

            FinTot=FinTot+Sum;
            }
        // TOTAL DISPLAY BLOCK
        Final=Final+("\n---------------------------------------------------------------");
                Final=Final+("\nTOTAL    \t\t");
            
            for (int Week =0;Week<ArrColSum.length;Week++){ Final=Final+(ArrColSum[Week]+"\t");
            }
            Final=Final+FinTot;
                       

            
            return Final;
}



// SIMPLIFIED PROCESSES (REMOVED FUNCTIONS)
public static String RowDisp(int[][] ArrInput){ // DISPLAY ROW TOTAL ONLY
    String Final="";

        
        int FinTot=0;
        
        for (int Set =0;Set<ArrInput[1].length;Set++){
        }
        for (int i =0;i<ArrInput.length;i++){
                int Sum=0;
                Final=Final+("\n"+"A"+"\t"); // ADD LABEL usee array[i] if possible
                
                
            for (int j =0;j<ArrInput[1].length;j++){
                Final=Final+("\t" +ArrInput[i][j]);
                Sum=Sum+ArrInput[i][j];
            } 
            Final=Final+("\t"+ Sum);
            FinTot=FinTot+Sum;
            }
        
        // TOTAL DISPLAY BLOCK
        Final=Final+("\n---------------------------------------------------------------");
                Final=Final+("\nTOTAL    \t\t");
            

            Final=Final+FinTot;
                       

            
            return Final;
                    }

}
