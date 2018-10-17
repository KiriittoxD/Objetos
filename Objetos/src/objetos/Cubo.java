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
public class Cubo extends Cuadrado {
    public double N;
    public double operacion;

    public Cubo(double lado) {
        super(lado);

        this.N = lado;
    }


    public  double calcularVolumen(){
        return Math.pow(this.N,3);
    }


    public   double calcularPerimetro(boolean is_super)
    {

        if (is_super){
           return super.calcularPerimetro ();
        }
        else{
            return this.N*12;
        }


    }
}
