package JAVA.Grafos;

public class Aresta {
	private final String identificador;
	private double peso;
	private boolean ponderado;
	private int origem;
	private int destino;

	public Aresta(int origem, int destino) {
		this.origem = origem;
		this.destino = destino;
		this.identificador = origem + "->" + destino;	
	}

		public Aresta(int origem, int destino, double peso ) {
		this.origem = origem;
		this.destino = destino;
		this.identificador = origem + "->" + destino;	
		this.peso = peso;
		this.ponderado = true;
	}

	public int getOrigem() {
		return origem;
	}

	public int getDestino() {
		return destino;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}

	public void setDestino(int destino) {
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
