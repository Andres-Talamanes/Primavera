package ArbolesEstructura.arbolbinario;

public class Nodo {
    protected Object dato;
    protected Nodo izq;
    protected Nodo der;
    public Nodo(Object valor) {
        this.dato = valor;
        this.izq = null;
        this.der = null;
    }
    /**
     * Método constructor
     * @param ramaIzdo
     * @param valor
     * @param ramaDcho
     */
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izq = ramaIzdo;
        der = ramaDcho;
    }
    /**
     * Regresa el valor del nodo
     * @return data del nodo
     */
    public Object valorNodo() {
        return dato;
    }
    /**
     * Regresa el nodo izquierdo
     * @return nodo izquierdo
     */
    public Nodo subarbolIzdo() {
        return izq;
    }
    /**
     * Regresa el nodo derecho
     * @return nodo derecho
     */
    public Nodo subarbolDecho() {
        return der;
    }
    /**
     * Asigna un nuevo valor al nodo
     */
    public void nuevoValor(Object valor) {
        this.dato = valor;
    }
    /**
     * Asigna un nuevo valor al nodo izquierdo
     * @param izq
     */
    public void ramaIzdo(Nodo izq) {
        this.izq = izq;
    }
    /**
     * Asigna un nuevo valor al nodo derecho
     * @param der
     */
    public void ramaDcho(Nodo der) {
        this.der = der;
    }
}
