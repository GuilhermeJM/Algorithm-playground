package JAVA.Grafos;
import java.util.*;

public class direcionado extends Grafo {
    
    private List<Aresta> arestas;

    public direcionado(){
        this.arestas = new ArrayList<Aresta>();
    }

    @Override
    public void adicionarAresta(int origem, int destino) {
        if(getIndexByIdentificador(origem + "->" + destino) == -1) {
            Aresta aresta = new Aresta(origem, destino);
            this.arestas.add(aresta);
        }
        // Implementação específica para grafos direcionados
    }

    @Override
    public void removerAresta(int origem, int destino) {
        int index = getIndexByIdentificador(origem + "->" + destino);
        if(index != -1) {
            this.arestas.remove(index);
        }
    }
        // Implementação específica para grafos direcionados

    @Override
    public int size() {
        return this.arestas.size();
    }

    private int getIndexByIdentificador(String identificador) {
        for(int i = 0; i < arestas.size(); i++) {
            if(arestas.get(i).getIdentificador().equals(identificador)) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encontrar o identificador
    }

    @Override
    public Iterator<Aresta> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
