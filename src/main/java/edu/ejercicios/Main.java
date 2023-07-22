package edu.ejercicios;

import edu.ejercicios.ejemplos.Ejercicios;
import edu.ejercicios.ejemplos.clsEjemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");

        //String varA,varB="";
        //try {
            //BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            //System.out.print("Ingrese A:");
            //varA = lector.readLine();
            //System.out.print("Ingrese B:");
            //varB=lector.readLine();
            //System.out.println("Valor a="+varA+" Valor de b="+varB);
        //}catch(Exception ex ){
            //System.out.println("Ingreso mal el dato");
        //}
        //clsEjemplo1 ej = new clsEjemplo1();
        //ej.calculo();
        Ejercicios ejerc=new Ejercicios();
        ejerc.ejercicio1();
    }
}