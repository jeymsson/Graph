package Caracteristics;

import List.List;

public class CaractGraph {
	private Types tipo;
	private int numVertices, numEdges, numCiclos, numEdgesDir, time;

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
		this.time = b.getTime();
		this.tipo = Types.Graph;
	}


	// Getters e Setters.
	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}
	public void setNumEdges(int numEdges) {
		this.numEdges = numEdges;
	}
	public void setNumCiclos(int numCiclos) {
		this.numCiclos = numCiclos;
	}
	public void setNumEdgesDir(int numEdgesDir) {
		this.numEdgesDir = numEdgesDir;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getNumVertices() {
		return this.numVertices;
	}
	public int getNumEdges() {
		return this.numEdges;
	}
	public int getNumCiclos() {
		return this.numCiclos;
	}
	public int getNumEdgesDir() {
		return this.numEdgesDir;
	}
	public int getTime() {
		return this.time;
	}
	public static class Builder {
		private int numVertices, numEdges, numCiclos, numEdgesDir, time;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public CaractGraph Build() {
			return new CaractGraph(this);
		}


		// Getters e Setters.
		public Builder setNumVertices(int numVertices) {
			this.numVertices = numVertices;
			return this;
		}
		public Builder setNumEdges(int numEdges) {
			this.numEdges = numEdges;
			return this;
		}
		public Builder setNumCiclos(int numCiclos) {
			this.numCiclos = numCiclos;
			return this;
		}
		public Builder setNumEdgesDir(int numEdgesDir) {
			this.numEdgesDir = numEdgesDir;
			return this;
		}
		public Builder setTime(int time) {
			this.time = time;
			return this;
		}
		public int getNumVertices() {
			return this.numVertices;
		}
		public int getNumEdges() {
			return this.numEdges;
		}
		public int getNumCiclos() {
			return this.numCiclos;
		}
		public int getNumEdgesDir() {
			return this.numEdgesDir;
		}
		public int getTime() {
			return this.time;
		}
	}
	
}
