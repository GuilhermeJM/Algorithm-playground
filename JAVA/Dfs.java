package JAVA;

import java.util.*;

import JAVA.Grafos.*;

public class Dfs {

    public Dfs(){

    }

    public List<Integer> dfsRecursivo(Grafo grafo, int index){

        List<Integer> ordemDeVisitados = new ArrayList<>();
        Boolean[] visitados = new Boolean[grafo.size()];
        Arrays.fill(visitados, false);

        visitados[index] = true;
        ordemDeVisitados.add(index);        

        for(Aresta vizinho : grafo){

            if(!visitados[vizinho.getDestino()]){
                ordemDeVisitados = dfsRecursivo(grafo, vizinho.getDestino(), visitados, ordemDeVisitados);

            }

        }
        return ordemDeVisitados;
    }

    public List<Integer> dfsRecursivo(Grafo grafo, int index, Boolean[] visitados, List<Integer> ordemDeVisitados){

        visitados[index] = true;
        ordemDeVisitados.add(index);        

        for(Aresta vizinho : grafo){

            if(!visitados[vizinho.getDestino()]){
                ordemDeVisitados = dfsRecursivo(grafo, vizinho.getDestino(), visitados, ordemDeVisitados);

            }

        }

        return ordemDeVisitados;

    }

}
