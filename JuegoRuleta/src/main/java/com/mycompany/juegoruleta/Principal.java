/*
 * Simulacion de un juego de ruleta
 */
package com.mycompany.juegoruleta;
//Librerias a utilizar
import java.util.Random;
import java.util.Scanner;
/**
 * @author Robson Salazar 0900-12-10213
 */
public class Principal {
    //Metodo principal
    public static void main(String[] args){
        //Definicion de variables
        //Controla si se debe continuar apostando
        Boolean blnApostar = true;
        //Indica el saldo de puntos del usuario
        Integer intSaldo = 100;
        //Indica el valor que se cobra por cada apuesta
        Integer intCostoApuesta = 10;
        //Da la bienvenida al usuario
        System.out.println("Bienvenido(a) a la ruleta!");
        //Mantiene ejecución mientras el usuario así lo decida
        do{
            //Pregunta al usuario si desea apostar
            System.out.println("Deseas apostar (S/N)?");
            Scanner objInput = new Scanner(System.in);
            String strCadena = objInput.nextLine();
            //Valida si el usuario quiere seguir apostando
            if(strCadena.equals("S")||strCadena.equals("s")){
                //Indica que el usuario aun quiere apostar
                blnApostar = true;
                //Valida si el saldo de puntos del usuario es suficiente para apostar
                if (intSaldo >= 10){
                    //Descuenta al saldo de puntos del usuario el costo de la apuesta
                    intSaldo = intSaldo-intCostoApuesta;
                    //Pregunta al usuario el numero al que desea apostar
                    System.out.println("Indica el numero al que deseas apostar [1 - 10]");
                    Scanner objInput2 = new Scanner(System.in);
                    String strCadena2 = objInput2.nextLine();
                    //Convierte el valor ingresado por el usuario a entero
                    Integer intNumero = 0;
                    //Se captura posible error de conversion
                    try{
                        intNumero = Integer.parseInt(strCadena2);
                    }catch(Exception e){
                        System.out.println("***Numero incorrecto***");
                    }
                    //Declara variables para control de color del numero
                    Boolean blnPar = false;
                    Boolean blnParRuleta = false;
                    //Valida que el numero ingresado por el usuario se encuentre entre 1 y 10
                    if(intNumero <= 10 & intNumero>0){
                        //Lanza numero random de 0-9 para simular un ciclo de la ruleta, se suma 1 unidad para que sea de 1 a 10
                        Random rn = new Random();
                        int intNumeroRuleta = rn.nextInt(10)+1;
                        //Indica el numero y color apostado
                        System.out.println("El numero apostado es:"+intNumero);
                        System.out.println("El numero de la ruleta  es:"+intNumeroRuleta);
                        /*
                            Reglas de negocio
                        */
                        //Valida si el numero ingresado por el usuario es par para saber su color
                        if (intNumero%2 == 0){
                            blnPar = true;
                        }
                        //Valida si el numero de la ruleta es par para saber su color
                        if (intNumeroRuleta%2 == 0){
                            blnParRuleta = true;
                        }
                        //Valida si el numero apostado es igual al numero de la ruleta
                        if(intNumero==intNumeroRuleta){
                            //Triplica el valor de la apuesta
                            intSaldo += (intCostoApuesta*3);
                            System.out.println("Felicidades has acertado el numero, has triplicado tu apuesta, puntos:"+intSaldo);
                            //Valida si ambos numeros son pares para saber si coincide el color
                        }else if(blnPar==blnParRuleta){
                            //Duplica el valor de la apuesta
                            intSaldo += (intCostoApuesta*2);
                            System.out.println("Felicidades has acertado el color, has duplicado tu apuesta, puntos:"+intSaldo);
                        }else{
                            //Indica que perdio la apuesta pues no coincide numero ni color
                            System.out.println("Vaya, has perdido tu apuesta, puntos:"+intSaldo);
                        }
                    }
                    else{
                        //Indica que no se puede apostar al numero ingresado y se coloca bandera de control en falso
                        System.out.println("El valor ingresado no es valido");
                        blnApostar = false;
                    }
                }else{
                    //Indica que no se puede apostar ya que no tiene suficientes puntos y se coloca bandera de control en falso
                    System.out.println("Vaya, no tienes suficientes puntos para apostar");
                    blnApostar = false;
                }
            }else{
                //Despide al usuario y se coloca bandera de control en falso
                System.out.println("Gracias por participar :)");
                blnApostar = false;
            }
        }while (blnApostar == true);
    }
}
