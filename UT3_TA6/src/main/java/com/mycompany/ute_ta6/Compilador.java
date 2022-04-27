/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ute_ta6;

/**
 *
 * @author facum
 */
public class Compilador {
    
    
    public boolean controlCorchetes (String secuencia){
        if ((secuencia.toCharArray()[0] != '{') || secuencia.toCharArray()[secuencia.toCharArray().length-1] != '}'  || (secuencia.isBlank())){//no comienza con { o no termina en } o viene en blanco
            return false;                                                                                                                       
        }
        IPila<Character> nuevaPila = new Pila<Character>(); //Pila puede ser cualquier tipo esta vez sera Character
        
        for (char caracter : secuencia.toCharArray()){
            
            if (caracter == '{' || caracter == '}'){
                if (nuevaPila.esVacia()){
                    if (caracter == '}'){
                        return false;
                    }
                    else{
                        nuevaPila.apilar(caracter);
                    }
                } else{
                   if (nuevaPila.tope() == caracter){ //Se sabe que esta pila solo contiene Characters
                    nuevaPila.apilar(caracter);
                   } else {
                    nuevaPila.desapilar();
                     } 
                   }   
               
            }
        }
        return nuevaPila.esVacia();
    }
   
}
