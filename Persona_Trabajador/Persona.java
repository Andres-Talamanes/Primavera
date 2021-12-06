public class Persona {
    
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;
    private String genero;

    //CONSTRUCTOR DE PERSONA
    public Persona(String nombre, String apellido_paterno, String apellido_materno, int edad, String genero) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.genero = genero;
    }

    // getter y setter de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // getter y setter de Apellido Paterno
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    // getter y setter de Apellido Materno
    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
    
    // getter y setter de la Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // getter y setter del Genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    
}
