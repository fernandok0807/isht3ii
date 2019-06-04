/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

/**
 *
 * @author enmanuel
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dato;
        System.out.println("Ejemplo 1 Palabra Palindromo");
        dato="reconocer";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 2 Cadena Vacia");
        dato="";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 3 Cadena con Simbolos");
        dato="abc#*#cba";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 4 Cadena con un caracter");
        dato="a";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 5 Cadena con dos caracteres");
        dato="si";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 6 Cadena null");
        dato= null;
        try{
            System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        }
        catch(IllegalArgumentException a){
            System.out.println("Probando {"+dato + "} - Resultado {"+a.getMessage()+"}\n");
        }
        
        System.out.println("Ejemplo 7 Frase palindromo");
        dato="Ali tomó tila";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 8 Cadena con espacios");
        dato="abc d cba";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        System.out.println("Ejemplo 9 Cadena con tabuladores");
        dato="si \t is";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        
        System.out.println("Ejemplo 10 Cadena con saltos de línea");
        dato="si es ana\n"
                + "ana se is";
        System.out.println("Probando {"+dato + "} - Resultado {"+evaluate(dato)+"}\n");
        
        
    }
    
    public static boolean evaluate(String word) {
        if (word == null) {
            throw new IllegalArgumentException("You can't pass a null String as input.");
        }
        boolean result = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

}
