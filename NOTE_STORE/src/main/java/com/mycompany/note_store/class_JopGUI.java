/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.note_store;
import javax.swing.JOptionPane;
/**
 *
 * @author sandy
 */
public class class_JopGUI { // Output message
    public void DisplayMessage(){
            JOptionPane.showMessageDialog(null, "Message", "Title", 
                                           JOptionPane.INFORMATION_MESSAGE);
    
    }
    public void InputBox(){// Functions like scanner with GUI
    String input = JOptionPane.showInputDialog("Prompt:");
    
    }
    
    public void DialogBox(){// Y/N
int A = JOptionPane.showConfirmDialog(null, "Message", "Title",JOptionPane.YES_NO_CANCEL_OPTION);
switch(A ){
    case JOptionPane.YES_OPTION:
        // Yes option code
        break;
        case JOptionPane.NO_OPTION:
        // No option code
        break;    

    case JOptionPane.CANCEL_OPTION:
        // Cancel option code
        break;


}
    
    }
    
}
