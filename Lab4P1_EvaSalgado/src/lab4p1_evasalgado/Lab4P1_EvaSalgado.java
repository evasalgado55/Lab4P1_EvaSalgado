/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p1_evasalgado;
import java.util.Scanner;
/**
 *
 * @author Eva Salgado
 */
public class Lab4P1_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int opcion; 
        char resp = 's'; 
        while (resp == 's'|| resp=='S'){
            System.out.println("Menu de opciones\n1.: substitute\n2.: palindroma\n3. Contenida o no\n4. Salida");
            opcion = leer.nextInt(); 
            
            switch(opcion){
             case 1: 
                    
                    String cadena3 = " ";
                    System.out.println("Ingrese una cadena(con el símbolo %d): ");
                    leer.nextLine();
                    String cadena1 = leer.nextLine();
                    System.out.println("Ingrese cadena que hará la subtitución: ");
                    String cadena2 = leer.next(); 
                    for(int i=0;i<cadena1.length();i++){
                      char mover = cadena1.charAt(i);
                       
                      if(mover == '%' &&cadena1.charAt(i+1)=='d'){
                          cadena3 += cadena2; 
                          i++; 
                      } else {
                          cadena3 += cadena1.charAt(i); 
                      } 
                    } System.out.println(cadena3);
                          
                 break; 
                
            case 2:
                    int ordlet=0;
                    int ordinv=0; 
                    String pali = " ";
                    String pali2 = " "; 
                    System.out.println("Ingrese una palabra: ");
                    String word = leer.next().toLowerCase(); 
                  
                   for (int j=0;j<word.length();j++){
                        char letter = word.charAt(j); 
                        ordlet = letter; 
                        if(ordlet<123&&ordlet>96){
                          pali = pali + letter;   
                        } 
                   }
                    for (int i=word.length()-1;i>=0;i--){
                        char wordinv = word.charAt(i); 
                        ordinv = wordinv; 
                        if(ordinv<123&&ordinv>96){
                            pali2 = pali2 + wordinv; 
                        }
                    }
                      if(pali2.equals(pali)){
                        System.out.println("La palabra es Palíndroma");
                    } else {
                        System.out.println("La palabra no es Palíndroma");
                    }
                    System.out.println();
                 break; 
                
            case 3: 
               int numletter = 0;
               int numbuscar = 0;
               String let = " "; 
               String bsuc = " ";
                System.out.println("Ingrese una cadena larga: ");
                String largo = leer.next().toLowerCase(); 
                System.out.println("Ingrese una cadena corta: ");
                String corto = leer.next().toLowerCase(); 
                 
                for(int i=0;i<largo.length();i++){
                
                    char letter = largo.charAt(i);
                    numletter = letter; 
                    if(numletter<123&&numletter>96){
                       let = let + letter;  
                    }
                    
                
                 
                } for (int j=0;j<corto.length();j++){
                        char buscar = corto.charAt(j); 
                        numbuscar = buscar; 
                        if(numbuscar<123&&numbuscar>96){
                            bsuc=bsuc+buscar; 
                        }
                }  if (bsuc.equals(let)){
                        System.out.println("La cadena corta está contenida en la cadena larga: ");
                 } else{
                        System.out.println("La cadena corta no está contenida en la cadena larga: ");
                    }
                  
            
                 
                 
                     
                 
             break; 
                
            
            }  
         System.out.println("Quiere probar otra opcion?[s/n]: ");
         resp = leer.next().charAt(0);
          
        }
    }
    
}
