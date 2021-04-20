/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

//import java.util.Scanner;

/**
 *
 * @author melid
 */
public class Arreglos {
    
    
  public static void  sumarLista(int lista[]){
   int suma=0;
   double promedio=0;
   
   for (int i=0; i < lista.length;i++){
       suma += lista[i];
   
   }
    promedio+= (suma/lista.length);
    
    
    System.out.println("La suma es: "+suma);
    System.out.println("El promedio es: "+promedio);
}

  
   
   
   
   public static void buscarMayor(int lista[]){
       int nro=0;
       
       for( int i=0; i<lista.length; i++){
           if (nro < lista[i]){
               nro = lista[i];
           }
       }
           System.out.println("El número mayor es: "+nro);
       }

   
   
  public static int cuentaVocales (String palabra){
      int cantidad=0;
      for(int i=0; i<palabra.length();i++){
           if  (( palabra.charAt(i)=='A') || (palabra.charAt(i)=='a') ||
               (palabra.charAt(i)=='E') || (palabra.charAt(i)=='e') ||
                   (palabra.charAt(i)=='I') || (palabra.charAt(i)=='i') ||
                   (palabra.charAt(i)=='O') || (palabra.charAt(i)=='o') ||
                   (palabra.charAt(i)=='U') || (palabra.charAt(i)=='u') ){
               cantidad++;
           }
      } 
      System.out.println("La palabra contiene: "+cantidad+" vocales");
      return cantidad;

}
  
  public static int cuentaCaracter (String cadena, char c){
      int cantidad=0;
      for(int i=0; i<cadena.length();i++){
          if(cadena.charAt(i)==c){
              cantidad++;
          }
        }
      return cantidad;
  }
}

    
    
    
//   
//   /** static public void contarCaracter(char lista[]){
//        
//       String frase= "La vida es Bella";
//        char caracter[]= frase.toCharArray();
//        
//        for(int i=0; i<frase.length();i++){
//        System.out.println("Los caracteres: "+caracter[i]);
//        
//        
//    }
//
//    
//}


