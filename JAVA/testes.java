package JAVA;


import java.util.*;

import JAVA.Grafos.Grafo;
import JAVA.Grafos.direcionado;

public class testes{
        public static void main(String[] args) {
                List<Integer> nos = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
                Grafo grafo = new direcionado();

                for (int num : nos) {
                        grafo.adicionarVertice(num);
                }
                grafo.adicionarAresta(0, 1);



//      Bfs algoritmo = new Bfs();
//      Dfs algoritmo2 = new Dfs();
//      System.out.println(algoritmo.bfsInterativo(grafo, 0));
//      System.out.println(algoritmo2.dfsRecursivo(grafo, 0));
}

}