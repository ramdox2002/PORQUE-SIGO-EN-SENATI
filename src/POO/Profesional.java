package POO;

import java.util.HashMap;
import java.util.Map;

public class Profesional {

    // Método para agregar un profesional a la lista
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
