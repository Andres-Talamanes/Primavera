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

    // Nodo a1, a2, a;
    // Pila pila = new Pila();
    // ArbolBinario arbol;
    // a1 = ArbolBinario.nuevoArbol(null, "Leon", null);
    // a2 = ArbolBinario.nuevoArbol(null, "Mafer", null);
    // a = ArbolBinario.nuevoArbol(a1, "Andres", a2);
    // pila.push(a);
    
    // a1 = ArbolBinario.nuevoArbol(null, "PABLO", null);
    // a2 = ArbolBinario.nuevoArbol(null, "BRANDON", null);
    // a = ArbolBinario.nuevoArbol(a1, "JENNY", a2);
    // pila.push(a);
    // a2 = (Nodo)pila.pop();
    // a2 = (Nodo)pila.pop();
    // a = ArbolBinario.nuevoArbol(a1, "Xenia", a2);
    // arbol = new ArbolBinario(a);
    // System.out.println();
Pila pila = new Pila();
ArbolBinario arbol;
Nodo a1, a2,a;
a1 = ArbolBinario.nuevoArbol(null, 7, null);
a2 = ArbolBinario.nuevoArbol(a1, 8, null);
pila.push(a2);

a1 = ArbolBinario.nuevoArbol(null, 14, null);
a = ArbolBinario.nuevoArbol(a1, 16, null);
pila.push(a);
a = ArbolBinario.nuevoArbol(a2, 12, a);
arbol = new ArbolBinario(a);
System.out.println("Arbol creado...");

//Otra manera de crearlo 
//Arbol(Raiz(nodoIzq1(nodoIzq1.1(,nodoDer(null,HOJA,null),), centro1.1, nodoDer(null)),raiz, (nododerecho())))
arbol = new ArbolBinario(new Nodo(new Nodo(new Nodo (null, 1, new Nodo(null, 3, null)), 4,null),5, new Nodo(new Nodo(null,6,null),7,new Nodo(new Nodo(null, 8, null),9,new Nodo(null, 10,null)))));
System.out.println("Arbol 2 creado...");

}

}
