package JAVA;


import java.util.*;

public class testes{
    
    public static void main(String[] args) {
        List<List<Integer>> grafo = new ArrayList<>();
        grafo.add(Arrays.asList(1, 2)); // Vértice 0
        grafo.add(Arrays.asList(0, 3)); // Vértice 1
        grafo.add(Arrays.asList(0, 3)); // Vértice 2
        grafo.add(Arrays.asList(1, 2)); // Vértice 3

        Bfs algoritmo = new Bfs();
        Dfs algoritmo2 = new Dfs();
        System.out.println(algoritmo.bfsInterativo(grafo, 0));
        System.out.println(algoritmo2.dfsRecursivo(grafo, 0));
    }

}