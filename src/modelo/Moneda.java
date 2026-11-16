/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Moneda {
    
    // Atributos Globales
    public int idMoneda;
    public String nombre;
    public double conversion;
    public String pais;
    
    // METODO
    
    // CONSTRUCTOR VACIO
    public Moneda(){}
    
    // CONSTRUCTOR CON ARGUMENTOS 
    public Moneda(int idMoneda,String nombre,double conversion,String pais){
        this.idMoneda=idMoneda;
        this.nombre=nombre;
        this.conversion=conversion;
        this.pais=pais;
    }
    
    
    
}
