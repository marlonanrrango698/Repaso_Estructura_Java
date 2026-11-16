/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Persona {
    // Atributos Globales 
    public String cedula;
    public String nombres;
    public String apellidos;
    public int edad; 
    public String sexo;
    public String direccion;
    public String telefono;
    public String correo;
    
    // CONSTRUCTOR VACIO
    public Persona(){}
    
    // CONSTRUCTOR CON ARGUMENTOS
    public Persona(String cedula,String nombres,String apellidos,int edad,String sexo,String direccion,String telefono,String correo){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad=edad;
        this.sexo=sexo;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
    
    }
    
}
