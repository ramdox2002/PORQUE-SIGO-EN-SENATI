/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import POO.Empleado;
import POO.Profesional;

/**
 *
 * @author USUARIO
 */
public class Empresa {
    // LISTA DE DATOS DE LA EMPRESA
    public static Map<String, Object> empresa = new HashMap<>();
    // Agregar datos de la empresa al Map 'data'
    // LISTA QUE CONTIENE DICIONARIOS DE EMPLEADOS
    
    public static Empresa em = new Empresa();

    public static Empleado pr = new Empleado();
    public static List<Map<String, Object>> listaProfesionales = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println(listaProfesionales);
        
        
        while (!false) { 
            em.mostrarMenuDeLaEmpresa();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite una opcion valida: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 16:
                         
                    
                    break;
                case 2:
                    System.out.println("Digite el ID del empleado al que desea aumentar el salario: ");
                    int empleadoID = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea pendiente

                    for (Map<String, Object> empleado : listaProfesionales) {
                        int id = (int) empleado.get("Id");
                        System.out.println("ID: "+id);
                        if (id == empleadoID) {
                            System.out.println("Ingrese el porcentaje de aumento del salario: ");
                            double porcentajeAumento = scanner.nextDouble();
                            scanner.nextLine(); // Consumir la nueva línea pendiente

                            pr.aumentarSalario(empleado, porcentajeAumento);
                            break;
                        }
                    }
                    break;
                case 3:

                    empresa.put("nombre", "IPS-TR");
                    empresa.put("fecha", "21 de septiembre de 2023");
                    empresa.put("ruc", "1234567890");
                    empresa.put("balance", 1000000.0);
                    
                    System.out.println("---------------------------------------");
                    System.out.println("INFORMACION DE LA EMPRESA");
                    System.out.println("---------------------------------------");
                    System.out.println("Nombre: " + empresa.get("nombre"));
                    System.out.println("-----------------------------");
                    System.out.println("|Fecha de creacion: " + empresa.get("fecha"));
                    System.out.println("---------------------------------------");
                    System.out.println("Ruc: " + empresa.get("ruc"));
                    System.out.println("-----------------------------");
                    System.out.println("|Balance: " + empresa.get("balance"));
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    System.out.println("Ingrese el ID del profesional para clasificar por edad: ");
                    int idProfesional = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea pendiente

                    for (Map<String, Object> empleado : listaProfesionales) {
                        int id = (int) empleado.get("Id");
                        if (id == idProfesional) {
                            int edad = (int) empleado.get("Edad");
                            String clasificacion = pr.getClasificacion(edad); // Llamamos al método para obtener la clasificación
                            System.out.println("La clasificación del profesional es: " + clasificacion);
                            break;
                        }
                    }
                    break;
                case 1:
                    while (true) {
                       System.out.println("Ingrese un id para el profesional: ");
                       int id = scanner.nextInt();
                       scanner.nextLine(); // Consumir la nueva línea pendiente

                       System.out.println("Ingrese un nombre para el profesional: ");
                       String nombre = scanner.nextLine();

                       System.out.println("Ingrese una cedula para el profesional: ");
                       String cedula = scanner.nextLine();

                       System.out.println("Ingrese una edad para el profesional: ");
                       int edad = scanner.nextInt();
                       scanner.nextLine(); // Consumir la nueva línea pendiente

                       System.out.println("Ingrese su estado civil (true o false) para el profesional: ");
                       boolean estadoCivil = scanner.nextBoolean();
                       scanner.nextLine(); // Consumir la nueva línea pendiente

                       System.out.println("Ingrese un salario aproximado para el profesional: ");
                       double salarioAproximado = scanner.nextDouble();
                       scanner.nextLine(); // Consumir la nueva línea pendiente

                       System.out.println("Ingrese un lenguaje dominante para el profesional: ");
                       String lenguajeDominante = scanner.nextLine();

                       System.out.println("Ingrese su experiencia laboral en años para el profesional: ");
                       int experienciaLaboral = scanner.nextInt();

                       
                       // Agregar el profesional a la lista
                       listaProfesionales.add(pr.agregarProfesional(id, nombre, cedula, edad, estadoCivil, salarioAproximado, lenguajeDominante, experienciaLaboral));

                       System.out.println("Profesional agregado correctamente.");

                       // Preguntar si desea agregar otro profesional
                       System.out.println("¿Desea agregar otro profesional? (true o false): ");
                       boolean agregarOtro = scanner.nextBoolean();
                       scanner.nextLine(); // Consumir la nueva línea pendiente

                       if (!agregarOtro) {
                           break; // Salir del bucle si no se desea agregar otro profesional
                       }
                   }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public Empresa () {
        
    }
    
    
    public void mostrarMenuDeLaEmpresa () {
        System.out.println("------------------------------------");
        System.out.println("| Opciones de la Empresa            |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1.- Añadir a un empleado          |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 2.- Aumentar sueldo a un empleado |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 3.- Ver Informacion de la Empresa |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 4. Clasificacion                 |");
        System.out.println("------------------------------------");
    }
    
    public void mostrarProfesionales() {
        if (listaProfesionales.isEmpty()) {
            System.out.println("No hay profesionales contratados.");
        } else {
            System.out.println("Lista de Profesionales:");
            for (Map<String, Object> item : listaProfesionales) {
                System.out.println("---------------------------------");
                System.out.println("|ID: " + item.get("Id") + "        |");
                System.out.println("|---------------------------------|");
                System.out.println("|Nombre: " + item.get("Nombre") + "        |");
                System.out.println("|-------------------------------|");
                System.out.println("|Cedula: " + item.get("Cedula") + "              |");
                System.out.println("|-------------------------------|");
                System.out.println("|Edad: " + item.get("Edad") + "                     |");
                System.out.println("|-------------------------------|");
                System.out.println("|Estado Civil: " + item.get("Estado Civil") + "            |");
                System.out.println("|-------------------------------|");
                System.out.println("|Salario: " + item.get("Salario") + "              |");
                System.out.println("|-------------------------------|");
                System.out.println("|Lenguaje Dominante: " + item.get("Lenguaje Dominante") + "       |");
                System.out.println("---------------------------------");
            }
        }
    }


    // Método para mostrar detalles de un empleado
    public static void mostrarDetallesProfesional(Map<String, Object> listaProfesionales) {
        System.out.println("Detalles del Empleado:");
        System.out.println("|ID: " + listaProfesionales.get("Id") + "                         |");
        System.out.println("|Nombre: " + listaProfesionales.get("Nombre") + "        |");
        System.out.println("|Cedula: " + listaProfesionales.get("Cedula") + "              |");
        System.out.println("|Edad: " + listaProfesionales.get("Edad") + "                     |");
        System.out.println("|Estado Civil: " + listaProfesionales.get("Estado Civil") + "            |");
        System.out.println("|Salario: " + listaProfesionales.get("Salario") + "              |");
        System.out.println("|Lenguaje Dominante: " + listaProfesionales.get("Lenguaje Dominante") + "       |");
        System.out.println("---------------------------------");
    }
    

}
