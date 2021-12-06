public class Trabajador extends Persona{
    
    
    private int ID;
    private double sueldo;
    private String puesto;


    //Constructor de Trabajador
    public Trabajador(String nombre, String apellido_paterno, String apellido_materno, int edad, String genero, int ID, double sueldo, String puesto) 
    {
        super(nombre, apellido_paterno, apellido_materno, edad, genero);
        this.ID = ID;
        this.sueldo=sueldo;
        this.puesto=puesto; 
    }

    public void mostrarDatos()
    {
        System.out.println("Nombre: " + getNombre() + 
        "\nApellido Paterno: " + getApellido_paterno() + 
        "\nApellido Materno: " + getApellido_materno() + 
        "\nEdad: " + getEdad() + 
        "\nGenero: " + getGenero() +
        "\nID: " + ID +
        "\nSueldo: " + sueldo +
        "\nPuesto: " + puesto);
    }
    
}
