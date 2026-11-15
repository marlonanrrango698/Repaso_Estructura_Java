/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Numero {
    // Atributos Globales -> Son la perspectiva Privada reservada
    // 1) Nivel Visibilidad
    // 2) Nombre
    // 3) Tipo de dato
    public int idNumero;
    public double valor;
    public String tipo;
    public char signo;
    
    // METODOS QUE CONFORMAN LAS CLASES -> Son las perspectiva publica 
    // 1) Metodos Cosntructores-> Inicializar los datos de un objeto-Tambien es el unico metodo que no tiene tipologia
    public Numero(){} // CONSTRUCTOR VACIO
    
    // Constructor con argumentos
    public Numero(int idNumero,double valor, String tipo,char signo){
        this.idNumero=idNumero;
        this.valor=valor;
        this.tipo=tipo;
        this.signo=signo;
        
    } 
    
    
}
