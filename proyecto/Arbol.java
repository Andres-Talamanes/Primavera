package proyecto;
public class Arbol {

    private Trabajador raiz;


    public Arbol(Trabajador ID)
    {
        this.raiz = new Trabajador(null, null, null, 0, null, 0, 0, null);
    }

    public Arbol() {
    }

    public Trabajador getRaiz() {
        return raiz;
    }

    public void setRaiz(Trabajador raiz) {
        this.raiz = raiz;
    }

    public boolean esVacio()
    {
        return raiz==null;
    }

    //Recorrer arbol InOrden
    public void inOrden(Trabajador r)
    {
        if(r!=null)
        {
            inOrden(r.getIzquierdo());
            System.out.print(r.getID() + "\t");
            inOrden(r.getDerecho());
        }
    }

    
}
