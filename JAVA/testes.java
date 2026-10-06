package JAVA;


import java.util.*;

import JAVA.Grafos.Grafo;
import JAVA.Grafos.direcionado;

public class testes{
    
    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        Grafo grafo = new direcionado();
        grafo.adicionarNos(nos);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(0, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(1, 5);
        
/**
        grafo.add(Arrays.asList(1, 2)); // Vértice 0
        grafo.add(Arrays.asList(0, 3)); // Vértice 1
        grafo.add(Arrays.asList(0, 3)); // Vértice 2
        grafo.add(Arrays.asList(1, 2)); // Vértice 3
*/
//      Bfs algoritmo = new Bfs();
        Dfs algoritmo2 = new Dfs();
//        System.out.println(algoritmo.bfsInterativo(grafo, 0));
        System.out.println(algoritmo2.dfsRecursivo(grafo, 0));
    }

}