package JAVA.Grafos;

public class Aresta {
	private final String identificador;
	private double peso;
	private boolean ponderado;
	private Vertice origem;
	private Vertice destino;

	public Aresta(Vertice origem, Vertice destino) {
		this.origem = origem;
		this.destino = destino;
		this.identificador = origem.getId() + "->" + destino.getId();
	}

		public Aresta(Vertice origem, Vertice destino, double peso ) {
		this.origem = origem;
		this.destino = destino;
		this.identificador = origem.getId() + "->" + destino.getId();
		this.peso = peso;
		this.ponderado = true;
	}

	public Vertice getOrigem() {
		return origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	public String getIdentificador() {
		return identificador;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isPonderado() {
		return ponderado;
	}

	public void definirPeso(double peso) {
		this.peso = peso;
		this.ponderado = true;
	}

	public void removerPeso() {
		this.peso = 0.0;
		this.ponderado = false;
	}
}
