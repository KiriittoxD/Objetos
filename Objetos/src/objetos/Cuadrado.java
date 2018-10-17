/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author moral
 */
public class Cuadrado {
    public double N;
    public double operacion;

    public  Cuadrado(double lado) {
        this.N =  lado;
    }
    public  double calcularArea(){
        operacion = N * N;
        return operacion;
    }

    public  double calcularPerimetro(){
        operacion = N * 4;
        return operacion;
   
    }
}
