/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Numero;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // CREAR O INSTANCIAR OBJETOS 
        // USANDO CONSTRUCTOR VACIO 
        // CHAR SIEMPRE ES CON COMILLA SIMPLE
        Numero n1=new Numero();
        n1.idNumero=100;
        n1.signo='+';
        n1.tipo="Entero";
        n1.valor=8;
        
        
        // USANDO EL COSNTRUCTOR CON ARGUMENTOS
        Numero n2=new Numero(200, 89, "Entero", '+');
        double suma=n1.valor+n2.valor;
        System.out.println("La suma es: "+suma);
        
        
        
    }
}
