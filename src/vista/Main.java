/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Numero;
import modelo.Persona;
import modelo.Moneda;
import modelo.Figuras_Geometricas;

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
        System.out.println(" ");
       
        // Ejercicio 3
        // Conversión de unidades: Convertir pesos colombianos a dólares.
        
        // Constructor Vacio
        Moneda pesoc=new Moneda();
        pesoc.idMoneda=401;
        pesoc.nombre="Peso Colombiano";
        pesoc.conversion=55000;
        pesoc.pais="Colombia"; 
        
        double calcu= pesoc.conversion / 3311;
        System.out.println("La cantidad en dolares americanos es: " + calcu);
        System.out.println(" ");
        
        // Ejercicio 4
        // Cálculo del Área y perímetro de un círculo
        
        // Constructor Vacio
        Figuras_Geometricas circulo=new Figuras_Geometricas();
        circulo.idFigura=500;
        circulo.nombre="Circulo";
        circulo.diametro=15;
        circulo.perimetro= circulo.diametro*3.1416;
        System.out.println("El perimetro del circulo es: "+circulo.perimetro+"cm");
        System.out.println(" ");
        double div=circulo.diametro/2;
        circulo.radio=div*div;
        circulo.area=circulo.radio*3.1416;
        System.out.println("El area del circulo es: "+circulo.area+"cm2");
        System.out.println(" ");
        
    }
}
