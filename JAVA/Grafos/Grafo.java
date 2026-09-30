package JAVA.Grafos;

public abstract class Grafo implements Iterable<Aresta>{

    public Grafo(){
    }

    public abstract void adicionarAresta(int origem, int destino);

    public abstract void removerAresta(int origem, int destino);

    public abstract int size();

    
}
