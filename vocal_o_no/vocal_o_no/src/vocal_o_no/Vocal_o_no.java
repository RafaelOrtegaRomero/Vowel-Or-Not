/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocal_o_no;

import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class Vocal_o_no {

  public static void es_vocal(char letra){
      
  boolean vocal=false;
  letra=Character.toLowerCase(letra);
  
   if(letra=='a' || letra=='e' || letra=='i'||letra=='o'||letra=='u'){
            vocal=true;
   } 
   
   System.out.println("Es una vocal: "+vocal);
   
  }
    
    public static void es_minuscula(char letra){
        boolean minuscula=false;
        
        if(letra>='a' && letra<='z' ){
        
            minuscula=true;
            
        }
        
        System.out.println("Es una minuscula: "+minuscula);
    
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        char letra;
        System.out.println("Dame una letra: ");
        
        letra=scan.next().charAt(0);
        
        
        es_vocal(letra);
        es_minuscula(letra);
        
        
    }
    
}
