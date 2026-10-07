package JAVA.Grafos;
import java.util.*;
public abstract class Grafo implements Iterable<Aresta>{

    public Grafo(){
    }

    public abstract void adicionarAresta(int origem, int destino);

    public abstract void removerAresta(int origem, int destino);

    public abstract void adicionarVertice(int vertice);

    public abstract int size();

    public abstract void adicionarNos(List<Integer> nos);
    
}
