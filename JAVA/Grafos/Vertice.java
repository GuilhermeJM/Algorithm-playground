import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Vertice {
	private final int id;
	private final List<Aresta> arestas;

	public Vertice(int id) {
		this.id = id;
		this.arestas = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public List<Integer> getVizinhos() {
		List<Integer> vizinhos = new ArrayList<>();
		for (Aresta aresta : arestas) {
			vizinhos.add(aresta.getDestino().getId());
		}
		return vizinhos;
	}

	public void adicionarAresta(Aresta aresta) {
		arestas.add(Objects.requireNonNull(aresta, "A aresta não pode ser nula"));
	}

	public boolean removerAresta(Aresta aresta) {
		return arestas.remove(aresta);
	}
}
