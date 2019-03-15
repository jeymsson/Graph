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
		public void setValor(Object valor) {
			Valor = valor;
		}
		public Types getTipo() {
			return this.tipo;
		}
		public void setTipo(Types tipo) {
			this.tipo = tipo;
		}
		public Collor getCor() {
			return this.cor;
		}
		public void setCor(Collor cor) {
			this.cor = cor;
		}
		public Arrow getSeta() {
			return this.seta;
		}
		public void setSeta(Arrow seta) {
			this.seta = seta;
		}
		public float getDistancia() {
			return this.distancia;
		}
		public void setDistancia(float distancia) {
			this.distancia = distancia;
		}
		public int getNumVertices() {
			return this.numVertices;
		}
		public void setNumVertices(int numVertices) {
			this.numVertices = numVertices;
		}
		public int getNumEdges() {
			return this.numEdges;
		}
		public void setNumEdges(int numEdges) {
			this.numEdges = numEdges;
		}
		public int getNumCiclos() {
			return this.numCiclos;
		}
		public void setNumCiclos(int numCiclos) {
			this.numCiclos = numCiclos;
		}
		public int getNumEdgesDir() {
			return this.numEdgesDir;
		}
		public void setNumEdgesDir(int numEdgesDir) {
			this.numEdgesDir = numEdgesDir;
		}
		public int getNumEdgesBidir() {
			return this.numEdgesBidir;
		}
		public void setNumEdgesBidir(int numEdgesBidir) {
			this.numEdgesBidir = numEdgesBidir;
		}
		public List getListaV() {
			return this.listaV;
		}
		public void setListaV(List listaV) {
			this.listaV = listaV;
		}
	}
	
}
