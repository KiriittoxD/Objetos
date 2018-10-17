/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author moral
 */
public class Objetos {
    static Cubo cubo;
    static double actual;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        valor ();
        calculo ();
        scanner.nextLine();
    }


    private static void calculo(){
        int  opt = get_menu();
        while(opt != 5)
        {
            actual = calcular(opt ,cubo);
            System.out.println("El valor es " +actual+ "\n");
            opt = get_menu ();
        }
        
        valor ();
        calculo ();
    }


    private static void valor(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado:\t");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("El valor debe de ser un entero");
            valor ();
        }



    }


    public static double calcular( int opt, Cubo cubo){

        double result = 0;
        switch (opt){
            case 1: result =cubo.calcularPerimetro(true); break;
            case 2: result = cubo.calcularArea (); break;
            case 3: result = cubo.calcularVolumen(); break;
            case 4: result = cubo.calcularPerimetro(false); break;
            case 5: valor();break;
            case 6: System.out.println ("Adios :3");System.exit (0);break;

        }
        return result;
    }

    public static int get_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese el calculo a realizar:\n");
        System.out.print ("1: Perímetro cuadrado \n");
        System.out.print ("2: Calcular área\n");
        System.out.print ("3: Calcular Volúmen\n");
        System.out.print ("4: Calcular Perímetro cubo\n");
        System.out.print ("5: Reinicio \n");
        System.out.print ("6: Salir del programa \n");

        int opt  = Integer.parseInt( scanner.nextLine());
        return opt;
    }
        
    }
    

