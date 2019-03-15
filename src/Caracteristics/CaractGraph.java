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
		public Builder setTipo(Types tipo) {
			this.tipo = tipo;
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
	}
	
}
