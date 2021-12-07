package ArbolesEstructura.pilagenerica;

public class NodoPila {
    private NodoPila nodo ;
    private Object data;
   
   /**
     * 
     * @param data
     */
   public NodoPila(Object data) {
       this.data = data;
   }
   
   public NodoPila getNodo() {
       return nodo;
   }
   
   public void setNodo(NodoPila nodo) {
       this.nodo = nodo;
   }
   
   public Object getData() {
       return data;
   }
   
   public void setData(Object data) {
       this.data = data;
   }
}
