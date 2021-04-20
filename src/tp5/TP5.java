/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp5;

import static tp5.Arreglos.*;


public class TP5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       int nro[]= {25,12,83,19};
      Arreglos.sumarLista(nro);
      Arreglos.buscarMayor(nro);
       int contar = Arreglos.cuentaCaracter("Melisa", 'p');
       System.out.println("La Cantidad de caracteres es: "+contar);
       Arreglos.cuentaVocales( "meelIIIssssaAAA");
    
 
 
      
     
   } 
       
}
       /** 
        String palabras[]={"Melisa", "Santo", "Pupi","Gino"};
       String p[]= new String[6];
            
       for(String it:palabras){
           
           System.out.println("palabra: "+it);
       }
       System.arraycopy(palabras, 0, p, 0, 4);//copio de palabras, de posicion0, a p, cantidad4
       
       
       for(String it:p){      //recorre p
           System.out.println("Copia: "+it);// muestra p
           
           
       }
       
      
    }
    */
    


