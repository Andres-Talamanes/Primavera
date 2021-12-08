package ArbolesEstructura.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ArbolesEstructura.arbolbinario.ArbolBinario;
import ArbolesEstructura.arbolbinario.Nodo;
import ArbolesEstructura.pilagenerica.Pila;

public class TestArbol {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
public static void main(String[] args) throws Exception {

    
Pila pila = new Pila();
ArbolBinario arbol;
Nodo a1, a2,a;
a1 = ArbolBinario.nuevoArbol(null, "" , null);
a2 = ArbolBinario.nuevoArbol(a1, "" , null);
pila.push(a2);

a1 = ArbolBinario.nuevoArbol(null, "" , null);
a = ArbolBinario.nuevoArbol(a1,"" , null);
pila.push(a);
a = ArbolBinario.nuevoArbol(a2, "", a);
arbol = new ArbolBinario();
System.out.println("Arbol creado..."); 


arbol = new ArbolBinario(new Nodo(new Nodo(new Nodo (null, 1, new Nodo(null, 3, null)), 4,null),5, new Nodo(new Nodo(null,6,null),7,new Nodo(new Nodo(null, 8, null),9,new Nodo(null, 10,null)))));
System.out.println("Arbol 2 creado...");

}

}
