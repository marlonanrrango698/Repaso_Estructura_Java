/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Figuras_Geometricas {
    // Atributos Globales
    
    public int idFigura;
    public String nombre;
    public double diametro;
    public double perimetro;
    public double radio;
    public double area;
    public double lado;
    public double diagonalmayor;
    public double diagonalmenor;
    
    
    // CONSTRUCTOR VACIO
    public Figuras_Geometricas(){}
    
    // CONSTRUCTOR CON ARGUMENTOS
    public Figuras_Geometricas(int idFigura,String nombre,double diametro,double perimetro,double radio,double area,double lado,double diagonalmayor,double diagonalmenor){
        this.idFigura=idFigura;
        this.nombre=nombre;
        this.diametro=diametro;
        this.perimetro=perimetro;
        this.radio=radio;
        this.area=area;
        this.lado=lado;
        this.diagonalmayor=diagonalmayor;
        this.diagonalmenor=diagonalmenor;
    
        }
}
    
    

