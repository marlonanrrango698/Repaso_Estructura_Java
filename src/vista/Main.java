/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Numero;
import modelo.Persona;

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
        
        
        // Ejercicio 1
        // Cálculo de promedio: Solicitar tres calificaciones, calcular el promedio aritmético y mostrarlo.
        
        // CONSTRUCTOR VACIO
        Numero nota1=new Numero();
        nota1.idNumero=301;
        nota1.signo='+';
        nota1.tipo="Decimal";
        nota1.valor=9.5;
        
        // CONSTRUCTOR VACIO
        Numero nota2=new Numero();
        nota2.idNumero=302;
        nota2.signo='+';
        nota2.tipo="Decimal";
        nota2.valor=6.5;
        
        // CONSTRUCTOR CON ARGUMENTOS
        Numero nota3=new Numero(303,7,"Decimal",'+');
        
        double sum=nota1.valor+nota2.valor+nota3.valor;
        double promedio=sum/3;
        System.out.println(" ");
        System.out.println("El promedio del Estudiante es: "+promedio);
        if (promedio >7){
            System.out.println("Aprobado");
        }else{
            System.out.println("Supletorio");
        }
        System.out.println(" ");

        // Ejercicio 2
        // Edad de la madre al dar a luz: Calcular la diferencia de edad entre una madre y su hijo dadas ambas edades.

        // Constructor Vacio
        Persona madre=new Persona();
        madre.cedula="1002676441";
        madre.nombres="Maria Isabella";
        madre.apellidos="Carapaz Ortega";
        madre.edad=45;
        madre.sexo="Femenino";
        madre.direccion="Ibarra";
        madre.telefono="0946258734";
        madre.correo="maria@gmail.com";
        
        // Constructor con argumentos
        Persona hijo=new Persona("1005444698", "Jose Esteban", "Aguilar Carapaz", 50, "Masculino", "Ibarra", "0945316875", "esteban@gmail.com");
        if (hijo.edad>madre.edad){
            System.out.println("La edad del hijo es incorrecta");
        }else{
           int sumaedades=madre.edad-hijo.edad; 
           System.out.println("La diferencia de edad entre la Sra "+madre.nombres+" "+madre.apellidos+" y el Sr "+hijo.nombres+" "+hijo.apellidos+" es "+ sumaedades+" años.");
        }
        
        
    }
}
