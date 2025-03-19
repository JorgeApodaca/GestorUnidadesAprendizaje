/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import mx.GestorUnidadesAprendizaje.facade.FacadeUnidad;
import mx.gestorunidadesaprendizaje.entidad.Unidades;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Main {

   private static FacadeUnidad facadeUnidad = new FacadeUnidad();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 5) {
            mostrarMenu();
            try {
                System.out.print("Ingrese una opción: ");
                opcion = Integer.parseInt(scanner.nextLine());
                ejecutarOpcion(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }
    }


    private static void mostrarMenu() {
        System.out.println("1. Crear unidad");
        System.out.println("2. Eliminar unidad");
        System.out.println("3. Buscar unidad");
        System.out.println("4. Actualizar unidad");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearUnidad();
                break;
            case 2:
                eliminarUnidad();
                break;
            case 3:
                buscarUnidad();
                break;
            case 4:
                actualizarUnidad();
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }

    private static void crearUnidad() {
        try {
            System.out.print("Ingrese el ID de la unidad: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese la clave de la unidad: ");
            int clave = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el nombre de la unidad: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese las horas de clase: ");
            float horasC = Float.parseFloat(scanner.nextLine());

            System.out.print("Ingrese las horas de teoría: ");
            float horasT = Float.parseFloat(scanner.nextLine());

            System.out.print("Ingrese las horas de laboratorio: ");
            float horasL = Float.parseFloat(scanner.nextLine());



            // Crear y guardar la unidad
            Unidades unidad = new Unidades(id, clave, nombre, horasC, horasT, horasL);
            facadeUnidad.guardarUnidad(unidad);

            System.out.println("Unidad creada con éxito.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar números válidos en los campos numéricos.");
        }
    }



    private static void eliminarUnidad() {
        System.out.print("Ingrese el ID de la unidad a eliminar: ");
        int id = scanner.nextInt();
        facadeUnidad.eliminarUnidad(id);
        System.out.println("Unidad eliminada.");
    }

    private static void buscarUnidad() {
        System.out.print("Ingrese el ID de la unidad a buscar: ");
        int id = scanner.nextInt();
        Unidades unidad = facadeUnidad.consultarUnidad(id);
        if (unidad != null) {
            System.out.println("Unidad encontrada: " + unidad.getNombre());
        } else {
            System.out.println("Unidad no encontrada.");
        }
    }

    private static void actualizarUnidad() {
        System.out.print("Ingrese el ID de la unidad a actualizar: ");
        int id = scanner.nextInt();
        Unidades unidad = facadeUnidad.consultarUnidad(id);
        if (unidad != null) {
            System.out.print("Ingrese el nuevo nombre de la unidad: ");
            String nombre = scanner.next();
            unidad.setNombre(nombre);
            facadeUnidad.guardarUnidad(unidad);
            System.out.println("Unidad actualizada.");
        } else {
            System.out.println("Unidad no encontrada.");
        }
    }
    
}
