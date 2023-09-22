/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO;
import POO.Empleado;

/**
 *
 * @author USUARIO
 */
public class Programador extends Empleado {

    /**
     * @param args the command line arguments
     */
    // ATRIBUTOS
    int lineaDeCodigoPorHora;
    String lenguajeDominante;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Programador (String nombre, String cedula, int edad, boolean estado_civil, double salario) {
        super(nombre, cedula, edad, estado_civil, salario);
        this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
}
