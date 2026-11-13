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

    }
    
    
    
    
}
