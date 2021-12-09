package proyecto; 
import ArbolesEstructura.arbolbinario.ArbolBinario;

public class Trabajador extends Persona{

    public int ID;
    private double sueldo;
    private String puesto;
    public Trabajador hijoizquierdo;
    public Trabajador hijoderecho;


    //Constructor de Trabajador
    public Trabajador(String nombre, String apellido_paterno, String apellido_materno, int edad, String genero, int ID, double sueldo, String puesto) 
    {
        super(nombre, apellido_paterno, apellido_materno, edad, genero);
        this.ID = ID;
        this.sueldo=sueldo;
        this.puesto=puesto;
        this.hijoderecho=null;
        this.hijoizquierdo=null; 
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

    // getter y setter de ID
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    // getter y setter de Sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // getter y setter de Puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    //-------------------------------
    public void Trabajador()
    {
        Trabajador ID = new Trabajador(getNombre(), getApellido_paterno(), 
        getApellido_materno(), getEdad(), getGenero(), getID(), getSueldo(), getPuesto());
    }

    //Saber si esta vacio
    public boolean esVacio()
    {
        this.ID = 0;
        return false;
    }

    //Recorrer arbol InOrden
    public void inOrden(Trabajador ID)
    {
        if(ID!=ID)
        {
            inOrden(ID.hijoizquierdo);
            System.out.print(ID.ID + "\t");
            inOrden(ID.hijoderecho);
        }
    }
    
    
}
