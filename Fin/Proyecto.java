package Fin;

import java.util.Scanner;

public class Proyecto{
    public static void main(String[] args) {
        int opcion;

        do
        {
            System.out.print("\n");
            System.out.println("|-------------------------------------------------------------|");
            System.out.println("|                       Menú del sistema                      |");
            System.out.println("|-------------------------------------------------------------|");
            System.out.println("|   1. Dar de alta a un empleado                              |");
            System.out.println("|   2. Dar de baja a un empleado                              |");
            System.out.println("|   3. Consulta de todos los empleados                        |");
            System.out.println("|   4. Consulta de los empleados por orden de ID              |");
            System.out.println("|   5. Modificar datos de un empleado                         |");
            System.out.println("|   6. Salir                                                  |");
            System.out.println("|-------------------------------------------------------------|\n");
    
            System.out.print("\nEscoja una opción: ");  
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();

            switch(opcion)
            {
                case 1: 
                    System.out.print("\n--------------- DAR DE ALTA A UN EMPLEADO ---------------------\n");
                    
                break;

                case 2:
                    System.out.print("\n--------------- DAR DE BAJA A UN EMPLEADO ---------------------\n");
                    
                break;
    
                case 3:
                    System.out.print("\n------------- CONSULTA DE TODOS LOS EMPLEADOS -----------------\n");
                break;

                case 4:
                    System.out.print("\n--------- CONSULTA DE LOS EMPLEADOS POR ORDEN DE ID -----------\n");
                                       
                break;

                case 5:
                    System.out.print("\n--------------- MODIFICAR DATOS DE UN EMPLEADO ----------------\n");
                    
                break;
    
                case 6:
                    System.out.print("\n---------------------------- SALIR ----------------------------\n");
                    System.out.println("\nEl programa ha finalizado ...\n");
                break;

                default: 
                System.out.println("\nEsa opción no está disponible.");
            }
        }
        while(opcion != 6);
    }
}