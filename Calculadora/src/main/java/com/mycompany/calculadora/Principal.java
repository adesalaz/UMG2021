/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Principal {
    //Método principal
    public static void main(String[] args){
        //Definicion de variables
        String strContinuar = null;
        //Ciclo
        do{
            //Escribe el menu
            System.out.println("Elija una opcion");
            System.out.println("a - Suma");
            System.out.println("b - Resta");
            System.out.println("c - Multiplicacion");
            System.out.println("d - Division");
            System.out.println("Escriba su opcion");
            //Recibe el valor del teclado
            Scanner objInput = new Scanner(System.in);
            String strOpcion = objInput.nextLine();
            //Definicion de variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0 ;
            //Define variable de error
            boolean blnError = true;
            //Inicia validacion de opcion elegida por el usuario
            switch(strOpcion){
                case "a":
                    strOpcion = "Suma";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0]+fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    //fin case
                    break;
                case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0]-fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    //fin case
                    break;
                case "c":
                    strOpcion = "Multiplicacion";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    
                    fltResultado = fltArrNumeros[0]*fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    //fin case
                    break;
                case "d":
                    strOpcion = "Division";
                    System.out.println("");
                    
                    //Solicitar los valores numericos
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    if(fltArrNumeros[1] > 0){
                        fltResultado = fltArrNumeros[0]/fltArrNumeros[1];
                        blnError = false;
                    }else{
                        System.out.println("No se puede dividir entre cero");
                        blnError = true;
                    }
                    //fin case
                    break;
                default:
                    System.out.println("Opcion no valida");
                    blnError = true;
            }
            System.out.println("");
            //Desplieghe de los datos si no hay error
            if(blnError==false){
                System.out.println("La opcion seleccionada es "+strOpcion);
                System.out.println("El resultado es:"+fltResultado);
            }else if(blnError == true){
                System.out.println("No se puede realizar la operacion");
            }
            System.out.println("Desea continuar? S/N");
            //Captura el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        }while("s".equals(strContinuar)||"S".equals(strContinuar));
        
    }
}
