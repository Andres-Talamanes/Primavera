import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Proyecto{
    public static void main(String[] args) {
        int opcion;


        ArrayList<Trabajador> trabajador = new ArrayList<Trabajador>();
        Random rd = new Random();

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
                    System.out.println("Inserta el nombre del Trabajador: ");
                    String nombre = entrada.next();
                    System.out.println("Apellido paterno: ");
                    String apellido_paterno = entrada.next();
                    System.out.println("Apellido materno: ");
                    String apellido_materno = entrada.next();
                    System.out.println("Edad del trabajador: ");
                    int edad = entrada.nextInt();
                    System.out.println("Genero del trabajador: ");
                    String genero = entrada.next();
                    System.out.println("Puesto del trabajador: ");
                    String puesto = entrada.next();
                    System.out.println("sueldo del trabajador: ");
                    Double sueldo = entrada.nextDouble();
                    int ID = rd.nextInt(100) + 1;
                    System.out.println("\n|--------------- EMPLEADO ANADIDO ---------------------|");

                    Trabajador t = new Trabajador(nombre, apellido_paterno, apellido_materno, edad, genero, ID, sueldo, puesto);

                    t.setNombre(nombre);
                    t.setApellido_paterno(apellido_paterno);
                    t.setApellido_materno(apellido_materno);
                    t.setEdad(edad);
                    t.setGenero(genero);
                    t.setID(ID);
                    t.setSueldo(sueldo);
                    t.setPuesto(puesto);

                    trabajador.add(t);

                break;

                case 2:
                    System.out.print("\n--------------- DAR DE BAJA A UN EMPLEADO ---------------------\n");
                    System.out.println(" ");
                    System.out.println("Inserta el ID del trabajador que quieres eliminar: ");
                    int id = entrada.nextInt();

                    Iterator<Trabajador> it = trabajador.iterator();

                    while(it.hasNext()){
                    Trabajador p = it.next();
                    if(p.getID() == id)
                    {
                        it.remove();
                    }
                    System.out.println("|--------------- EMPLEADO ELIMINADO ---------------------|");
                    }
                break;
    
                case 3:
                    System.out.print("\n------------- CONSULTA DE TODOS LOS EMPLEADOS -----------------\n");
                    for(Persona p: trabajador){
                        System.out.println(" ");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(
                        "Nombre: " + p.getNombre() + 
                        " | Apellido paterno: " +p.getApellido_paterno() + 
                        " | Apellido materno: " + p.getApellido_materno() + 
                        " | Edad: " + p.getEdad() + 
                        " | Genero: " + p.getGenero() + 
                        "\nPuesto: " + ((Trabajador) p).getPuesto()+
                        " | Sueldo: " + ((Trabajador) p).getSueldo()+
                        " | ID: " + ((Trabajador) p).getID() );
                        System.out.println("---------------------------------------------------------------");
    
                    }
                break;

                case 4:
                    System.out.print("\n--------- CONSULTA DE LOS EMPLEADOS POR ORDEN DE ID -----------\n");
                                       
                break;

                case 5:
                    System.out.print("\n--------------- MODIFICAR DATOS DE UN EMPLEADO ----------------\n");
                    System.out.println(" ");
                    System.out.println("Inserta el ID del trabajador que quieres Modificar: ");
                    int Id = entrada.nextInt();

                    System.out.println("Introduce nuevo nombre del trabajador: ");
                    String nombre2 = entrada.next();
                    System.out.println("Introduce nuevo apellido paterno: ");
                    String apellido_paterno2 = entrada.next();
                    System.out.println("Introduce nuevo apellido materno: ");
                    String apellido_materno2 = entrada.next();
                    System.out.println("Introduce nuevo edad del trabajador: ");
                    int edad2 = entrada.nextInt();
                    System.out.println("Introduce nuevo genero del trabajador: ");
                    String genero2 = entrada.next();
                    System.out.println("Introduce nuevo puesto del trabajador: ");
                    String puesto2 = entrada.next();
                    System.out.println("Introduce nuevo sueldo del trabajador: ");
                    Double sueldo2 = entrada.nextDouble();
                    int ID2 = rd.nextInt(100) + 1;
                    System.out.println("\n|--------------- EMPLEADO ANADIDO ---------------------|");
                    Iterator<Trabajador> It = trabajador.iterator();

                    while(It.hasNext()){
                    Trabajador p = It.next();
                    if(p.getID() == Id)
                    {
                        p.setNombre(nombre2);
                        p.setApellido_paterno(apellido_paterno2);
                        p.setApellido_materno(apellido_materno2);
                        p.setEdad(edad2);
                        p.setGenero(genero2);
                        p.setID(ID2);
                        p.setSueldo(sueldo2);
                        p.setPuesto(puesto2);
                    }
                    System.out.println("|--------------- EMPLEADO ELIMINADO ---------------------|");
                    }
                    
                    
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
