package ArbolesEstructura.pilagenerica;

public class Pila {

   private NodoPila cima;

   public Pila(){
      this.cima = null;
   }
   
   public void push(Object data){
      NodoPila nodo = new NodoPila(data);
      nodo.setNodo(cima);
      cima = nodo;
}

    public Object pop() throws Exception{ 
      Object val_cima=0;
      if(esVacia())throw new Exception("Pila vacia");
      //if(this.cima == null)throw new Exception("Pila vacia");
      
      val_cima = cima.getData();
      this.cima = this.cima.getNodo();
      return val_cima; 
      }
  
      private boolean esVacia(){
         //return cima== null ? true : false; también es correcto solo que implicicto
         return cima== null ? true : false;
      }
      
      /**
       * método para sacar cada elemento de la
       */
      public void peek(){
         NodoPila temporal = this.cima;

         while(temporal != null){
            System.out.println(temporal.getData());
            temporal = temporal.getNodo();
         }
         System.out.println("fin de la pila");
  }
}