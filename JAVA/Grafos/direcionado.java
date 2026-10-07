package JAVA.Grafos;
import java.util.*;

public class direcionado extends Grafo {
    
    private List<Aresta> arestas;
    private List<Vertice> vertices;

    public direcionado(){
        this.arestas = new ArrayList<Aresta>();
        this.vertices = new ArrayList<Vertice>();
    }

    @Override
    public void adicionarAresta(int origem, int destino) {

        Vertice verticeOrigem = getVertice(origem);
        Vertice verticeDestino = getVertice(destino);

        if(getIndexByIdentificador(verticeOrigem.getId() + "->" + verticeDestino.getId()) == -1) {
            Aresta aresta = new Aresta(verticeOrigem, verticeDestino);
            this.arestas.add(aresta);
        }
        // Implementação específica para grafos direcionados
    }
        @Override
    public void adicionarAresta(int origem, int destino, double peso) {

        Vertice verticeOrigem = getVertice(origem);
        Vertice verticeDestino = getVertice(destino);
        
        if(getIndexByIdentificador(verticeOrigem.getId() + "->" + verticeDestino.getId()) == -1) {
            Aresta aresta = new Aresta(verticeOrigem, verticeDestino, peso);
            this.arestas.add(aresta);
        }
        // Implementação específica para grafos direcionados
    }

    @Override
    public void removerAresta(int origem, int destino) {
        int index = getIndexByIdentificador(verticeOrigem.getId() + "->" + verticeDestino.getId());
        if(index != -1) {
            this.arestas.remove(index);
        }
    }
        // Implementação específica para grafos direcionados

    @Override
    public int size() {
        return this.nos.size();
    }

    private int getIndexByIdentificador(String identificador) {
        for(int i = 0; i < arestas.size()-1; i++) {
            if(arestas.get(i).getIdentificador().equals(identificador)) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encontrar o identificador
    }

    public void adicionarVertices(List<Integer> nos){
        this.nos = nos;
    }

    public void adicionarVertice(int vertice) {

        Vertice novoVertice = new Vertice(vertice);
        if (!vertices.contains(novoVertice)) {
            vertices.add(novoVertice);
        }
    }


    @Override
    public Iterator<Aresta> iterator() {
        return new MeuIterator();
    }

        // 3. Crie uma classe interna que implementa Iterator
    private class MeuIterator implements Iterator<Aresta> {
        private int indiceAtual = 0;

        // Verifica se ainda existem elementos para iterar
        @Override
        public boolean hasNext() {
            return indiceAtual < arestas.size();
        }

        // Retorna o próximo elemento e avança o ponteiro
        @Override
        public Aresta next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Não há mais elementos na coleção.");
            }
            return arestas.get(indiceAtual++);
        }

        // Método opcional (sobrescreva apenas se permitir remoção durante a iteração)
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remoção não suportada.");
        }
    }
}
