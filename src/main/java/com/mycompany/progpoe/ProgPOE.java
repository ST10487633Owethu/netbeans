/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;
import javax.swing.JOptionPane;

/**
 *
 * @author ST10487633 Owethu Kwami Khuzwayo
 */
public class ProgPOE {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Create a username (max 5 chars,use_):");
        String password = JOptionPane.showInputDialog("Create a password (min 8 chars): ");
        
        if (!username.contains("_")||username.length()>5) {
            JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is "
                    + "no more than five characters in lenght.");
            return;
        }else {
            JOptionPane.showMessageDialog(null,"Username successfully captured");
        }
        
       
                
       if (!password.contains(".*\\d.*")||!password.contains(".*!@#$%^&*(),.?{}|<>}")||password.length()>8){    
        JOptionPane.showMessageDialog(null,"password is not correctly formatted,please ensure that the password contains at least eight "
                    + "characters,a capital letter, a number, and a special character.");
            } else {
                JOptionPane.showMessageDialog(null,"Password succesfully captured");
                
                JOptionPane.showMessageDialog(null,"Account created!");
        
        String userLogin = JOptionPane.showInputDialog("Enter username to login:");
                String passwordLogin = JOptionPane.showInputDialog("Enter password:");
                
                
                
                if (username.equals(userLogin)&& password.equals(passwordLogin)){
                    JOptionPane.showMessageDialog(null,"Welcome back," +username+ "it is great to see you again!");
                    }else {
                    JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again.");
                    
                }   
                String phone = JOptionPane.showInputDialog("Enter SA phone number (+27XXXXXXXXX):");
                
                if (!isValidSAphone(phone)) {
                    JOptionPane.showMessageDialog(null,"Cellphone number incorrectly formatted or does not contain international code.");
                    
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Cellphone number successfully added.");
                }
            String regUsername = JOptionPane.showInputDialog(null,"Register-enter a username(max 5 characters,must contain '_':");
            String regPassword = JOptionPane.showInputDialog("Register-Enter a password(min 8 chars,capital letter, number,special characters):");
                    
                    
                    
                }








          
            
            
       
        
        
        
        
}

    private static boolean isValidSAphone(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

        
        
        
    


