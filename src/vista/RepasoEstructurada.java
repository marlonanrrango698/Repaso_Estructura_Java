/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RepasoEstructurada {
    //HOLA MUNDO
    //psvm + Tab
    public static void main(String[] args) {
        //sout + Tab
        // control + shift + c para comentar y descomentar
        System.out.println("HOLA MUNDO SOY MARLON");
        // Suma  de dos numeros
        // JOptionPane->Metodos con GUI
        // CONTROL + ESPACIO es como un asistente
        // Las letras pequeñas grises se ponen automaticamente se llaman parametros de entrada
        double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        double suma=n1 + n2;
        System.out.println("La suma es: " + suma);
        
        // Ejercicio 1
        // Cálculo de promedio: Solicitar tres calificaciones, calcular el promedio aritmético y mostrarlo.
        double nota1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera nota"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda nota"));
        double nota3=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera nota"));
        double sum= nota1 + nota2 + nota3;
        double prom= sum / 3;
        System.out.println("El promedio del estudiantes es: " + prom);

        
        // Ejercicio 2
        // Edad de la madre al dar a luz: Calcular la diferencia de edad entre una madre y su hijo dadas ambas edades.
        int edadmadre=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la Madre"));
        int edadhijo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del Hijo"));
        int resta= edadmadre - edadhijo;
        System.out.println("La edad de la madrea al dar a luz es: " + resta);
        
        
        // Ejercicio 3
        // Conversión de unidades: Convertir pesos colombianos a dólares.
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad en pesos colombianos a transformar"));
        double calcu= peso / 3281;
        System.out.println("La cantidad en dolares americanos es: " + calcu);
    }
    
    
    
    
}
