package JAVA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Bfs {
    
        public Bfs(){
        }
        
        public List<Integer> bfsInterativo(List<List<Integer>> grafo, int index){

        Queue<Integer> fila = new ArrayDeque<>();
        Boolean[] visitados = new Boolean[grafo.size()];
        Arrays.fill(visitados, false);
        fila.add(index);
        visitados[index] = true;
        List<Integer> ordemDeVisitados = new ArrayList<>();

        while(!fila.isEmpty()){
            int noAtual = fila.poll();
            for(int vizinho : grafo.get(noAtual)){

                if(!visitados[vizinho]){
                    fila.add(vizinho);
                    visitados[vizinho] = true;
                }

            }

            ordemDeVisitados.add(noAtual);

        }


        return ordemDeVisitados;


    }
}
