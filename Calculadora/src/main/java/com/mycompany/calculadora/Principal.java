/*
 * Simulacion de calculadora
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Robson Salazar 0900-12-10213
 */
public class Principal {
    //Método principal
    public static void main(String[] args){
        //Definicion de variables
        String strContinuar = null;
        //Mantiene ejecución mientras el usuario así lo decida
        do{
            //Escribe el menu
            System.out.println("Dispone de las siguientes opciones:");
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
                    //Solicitar los dos valores numericos y los almacena en la posición correspondiente en el vector
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    //Opera los números ingresados
                    fltResultado = fltArrNumeros[0]+fltArrNumeros[1];
                    //Indica que no ha ocurrido una excepción
                    blnError = false;
                    //fin case
                    break;
                case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    //Solicitar los dos valores numericos y los almacena en la posición correspondiente en el vector
                    for (int i=0;i<2;i++){
                        System.out.println("Ingrese el numero "+(i+1)+" : ");
                        fltArrNumeros[i]=objInput.nextFloat();
                    }
                    //Opera los números ingresados
                    fltResultado = fltArrNumeros[0]-fltArrNumeros[1];
                    //Indica que no ha ocurrido una excepción
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
                    //Opera los números ingresados
                    fltResultado = fltArrNumeros[0]*fltArrNumeros[1];
                    //Indica que no ha ocurrido una excepción
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
                    //Valida que el divisor sea mayor a cero
                    if(fltArrNumeros[1] > 0){
                        //Opera los números ingresados
                        fltResultado = fltArrNumeros[0]/fltArrNumeros[1];
                        //Indica que no ha ocurrido una excepción
                        blnError = false;
                    }else{
                        //Si el divisor es cero se controla excepcion
                        System.out.println("No se puede dividir entre cero");
                        //Indica que ha ocurrido una excepción
                        blnError = true;
                    }
                    //fin case
                    break;
                //Si la opción ingresada por el usuario no es válida indica que ocurrió una excepcion    
                default:
                    //Indica que ha ocurrido una excepción
                    System.out.println("Opcion no valida");
                    blnError = true;
            }
            System.out.println("");
            //Despliegue de los cálculos si no hay error
            //Si existe error lanza mensaje al usuario
            if(blnError==false){
                System.out.println("La opcion seleccionada es "+strOpcion);
                System.out.println("El resultado es:"+fltResultado);
            }else if(blnError == true){
                System.out.println("No se puede realizar la operacion");
            }
            //Pregunta al usuario si desea continuar con la ejecución
            System.out.println("Desea continuar? S/N");
            //Captura el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        }while("s".equals(strContinuar)||"S".equals(strContinuar));
    }
}