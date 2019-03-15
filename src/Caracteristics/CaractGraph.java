package Caracteristics;

import List.List;

public class CaractGraph {
	private Types tipo;
	private int numVertices, numEdges, numCiclos, numEdgesDir, numEdgesBidir;

	public CaractGraph() {
		// TODO Auto-generated constructor stub
		this.tipo = Types.Graph;
	}
	public CaractGraph(Builder b) {
		// TODO Auto-generated constructor stub
		this.numVertices = b.getNumVertices();
		this.numEdges = b.getNumEdges();
		this.numCiclos = b.getNumCiclos();
		this.numEdgesDir = b.getNumEdgesDir();
		this.numEdgesBidir = b.getNumEdgesBidir();
		this.tipo = Types.Graph;
	}
	
	
	
	public static class Builder {
		private Types tipo;
		private int numVertices, numEdges, numCiclos, numEdgesDir, numEdgesBidir;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public CaractGraph Build() {
			return new CaractGraph(this);
		}


		// Getters e Setters.
		public Types getTipo() {
			return this.tipo;
		}
		public void setTipo(Types tipo) {
			this.tipo = tipo;
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
	}
	
}
