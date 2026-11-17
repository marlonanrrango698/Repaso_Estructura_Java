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
        
    // MÉTODOS DE LOGICA DE NEGOCIO
    
    //MÉTODO DE NO RETORNO
    //PROGRAMACIÓN ESTRUCTURADA 
    public void calcularSuma(double n2){
        double n1=this.valor;
        double suma=n1+n2;
        System.out.println("La suma es: "+suma);
    } 
    // POO
    // MÉTODO VOID CON ARGUMENTOS
    public void calcularSuma(Numero n1,Numero n2){
        double suma=n1.valor+n2.valor;
        System.out.println("La suma es: "+suma); 
    } 
    
    //MÉTODO DE RETORNO SOLO CON UN ARGUMENTO
    public double calcularSuma(Numero n){
        double suma=this.valor+n.valor;
        System.out.println("La suma es: "+suma);
        return suma;
    }
    

}
