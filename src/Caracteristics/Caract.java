package Caracteristics;

import Graph.Arrow;
import List.List;

public class Caract {
	private Object Valor;
	private Types tipo;
	private Collor cor;
	private Arrow seta;
	private float distancia;
	private int numVertices, numEdges, numCiclos, numEdgesDir, numEdgesBidir;
	private List listaV;

	public Caract() {
		// TODO Auto-generated constructor stub
		this.tipo = Types.Vertice;
	}
	public Caract(Builder b) {
		// TODO Auto-generated constructor stub
		this.Valor = b.getValor();
		this.cor = b.getCor();
		this.listaV = b.getListaV();
		this.distancia = b.getDistancia();
		this.numVertices = b.getNumVertices();
		this.numEdges = b.getNumEdges();
		this.numCiclos = b.getNumCiclos();
		this.numEdgesDir = b.getNumEdgesDir();
		this.numEdgesBidir = b.getNumEdgesBidir();
		this.tipo = Types.Vertice;
	}
	
	
	
	public static class Builder {
		private Object Valor;
		private Types tipo;
		private Collor cor;
		private Arrow seta;
		private float distancia;
		private int numVertices, numEdges, numCiclos, numEdgesDir, numEdgesBidir;
		private List listaV;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public Caract Build() {
			return new Caract(this);
		}


		// Getters e Setters.
		public Object getValor() {
			return this.Valor;
		}
		public Builder setValor(Object valor) {
			Valor = valor;
			return this;
		}
		public Types getTipo() {
			return this.tipo;
		}
		public Builder setTipo(Types tipo) {
			this.tipo = tipo;
			return this;
		}
		public Collor getCor() {
			return this.cor;
		}
		public Builder setCor(Collor cor) {
			this.cor = cor;
			return this;
		}
		public Arrow getSeta() {
			return this.seta;
		}
		public Builder setSeta(Arrow seta) {
			this.seta = seta;
			return this;
		}
		public float getDistancia() {
			return this.distancia;
		}
		public Builder setDistancia(float distancia) {
			this.distancia = distancia;
			return this;
		}
		public int getNumVertices() {
			return this.numVertices;
		}
		public Builder setNumVertices(int numVertices) {
			this.numVertices = numVertices;
			return this;
		}
		public int getNumEdges() {
			return this.numEdges;
		}
		public Builder setNumEdges(int numEdges) {
			this.numEdges = numEdges;
			return this;
		}
		public int getNumCiclos() {
			return this.numCiclos;
		}
		public Builder setNumCiclos(int numCiclos) {
			this.numCiclos = numCiclos;
			return this;
		}
		public int getNumEdgesDir() {
			return this.numEdgesDir;
		}
		public Builder setNumEdgesDir(int numEdgesDir) {
			this.numEdgesDir = numEdgesDir;
			return this;
		}
		public int getNumEdgesBidir() {
			return this.numEdgesBidir;
		}
		public Builder setNumEdgesBidir(int numEdgesBidir) {
			this.numEdgesBidir = numEdgesBidir;
			return this;
		}
		public List getListaV() {
			return this.listaV;
		}
		public Builder setListaV(List listaV) {
			this.listaV = listaV;
			return this;
		}
	}
	
}
