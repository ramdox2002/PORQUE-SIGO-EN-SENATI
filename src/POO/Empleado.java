/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    

    public String getClasificacion(int edad) {
        if (edad <= 21) {
            return "Principiante";
        } 
        else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        }
        else if (edad >= 35) {
            return "Senior";
        }
        else {
            return "Usted no esta en posición de ser programado ni tiene experiencia laboral";
        }
    }

    // Método para aumentar el salario en un porcentaje
    public void aumentarSalario(Map<String, Object> empleado, double porcentaje) {
       double salario = (double) empleado.get("Salario Aproximado");
       salario += salario * (porcentaje / 100);
       empleado.put("Salario Aproximado", salario); // Actualiza el salario en el mapa del empleado
        System.out.println("Salario: "+ salario);
   }

        // Método para aumentar el salario en un porcentaje
    /*public static void aumentarSalario(Map<String, Object> empleado, double porcentaje) {
        if (empleado != null && empleado.containsKey("Salario Aproximado")) {
            double salario = (double) empleado.get("Salario Aproximado");
            salario += salario * (porcentaje / 100);
            empleado.put("Salario Aproximado", salario);
            System.out.println("----------------------");
            System.out.println("|Porcentaje | Sueldo |");
            System.out.println("|--------------------|");
            System.out.println("|"+porcentaje+"|"+salario+"|");
            System.out.println("Salario aumentado en un " + porcentaje + "%.");
        } else {
            System.out.println("No se pudo aumentar el salario. Información de empleado incorrecta.");
        }
    }*/

    public static Map<String, Object> agregarProfesional(int id, String nombre, String cedula, int edad,
                                                              boolean estado_civil, double salario, String lenguajeDominante, int experienciaLaboral) {
        Map<String, Object> profesional = new HashMap<>();
        profesional.put("Id", id);
        profesional.put("Nombre", nombre);
        profesional.put("Cedula", cedula);
        profesional.put("Edad", edad);
        profesional.put("Estado Civil", estado_civil);
        profesional.put("Salario Aproximado", salario);
        profesional.put("Experiencia Laboral", experienciaLaboral);
        profesional.put("Lenguaje Dominante", lenguajeDominante);
        return profesional;
    }
    
}
