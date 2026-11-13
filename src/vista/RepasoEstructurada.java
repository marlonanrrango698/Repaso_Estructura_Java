/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.sound.midi.SysexMessage;
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
        System.out.println("La edad de la madre al dar a luz es: " + resta);
        
        // Ejercicio 3
        // Conversión de unidades: Convertir pesos colombianos a dólares.
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad en pesos colombianos a transformar"));
        double calcu= peso / 3281;
        System.out.println("La cantidad en dolares americanos es: " + calcu);
        
        // Ejercicio 4
        // Cálculo del Área y perímetro de un círculo
        double diame=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el diametro del circulo"));
        double perimetro=diame*3.1416;
        System.out.println("El perimetro del circulo es: "+perimetro + "cm");
        double div=diame/2;
        double radio=div*div;
        double area=radio*3.1416;
        System.out.println("El area del circulo es: "+ area + "cm2");
        
        
        // Ejercicio 5
        // Cálculo del área y perímetro de un rombo
        double lado=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un lado del Rombo"));
        double peri=lado*4;
        double diagmay=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal mayor"));
        double diagmen=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal menor"));
        double multi=diagmay*diagmen;
        double are=multi/2;
        System.out.println("El perimetro del rombo es: " + peri + "cm");
        System.out.println("El area del rombo es: " + are + "cm2");
        
        
    }
    
    
    
    
}
