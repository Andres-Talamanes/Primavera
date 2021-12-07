package ArbolesEstructura.arbolbinario;

public class ArbolBinario {
    protected Nodo raiz;
    public ArbolBinario() {
        raiz = null;
    }
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }
    /**
     * Regresa la raiz del arbol
     * @return
     */
    public Nodo raizArbol() {
        return raiz;
    }
    boolean esVacio() {
        return raiz == null;
    }
    /**
     * 
     * @param ramaIzdo
     * @param valor
     * @param ramaDcho
     * @return
     */
    public static Nodo nuevoArbol(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        return new Nodo(ramaIzdo, valor, ramaDcho);
    }
}
