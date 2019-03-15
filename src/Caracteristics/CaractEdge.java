package Caracteristics;

import Graph.Arrow;

public class CaractEdge {
	private Object Valor;
	private Types tipo;
	private Collor cor;
	private boolean dir;

	public CaractEdge() {
		// TODO Auto-generated constructor stub
		this.tipo = Types.Edge;
	}
	public CaractEdge(Builder b) {
		// TODO Auto-generated constructor stub
		this.Valor = b.getValor();
		this.cor = b.getCor();
		this.dir = b.isDir();
		this.tipo = Types.Edge;
	}


	// Getters e Setters.
	public Object getValor() {
		return this.Valor;
	}
	public Collor getCor() {
		return this.cor;
	}
<<<<<<< HEAD
	public boolean isDir() {
		return this.dir;
	}
	public void setValor(Object valor) {
		Valor = valor;
	}
	public void setCor(Collor cor) {
		this.cor = cor;
	}
	public void setDir(boolean dir) {
		this.dir = dir;
=======
	public boolean isBiDir() {
		return this.biDir;
>>>>>>> 705f4771ef3b16f67a194ec64209d3e1cf9be072
	}
	public static class Builder {
		private Object Valor;
		private Collor cor;
		private boolean dir;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public CaractEdge Build() {
			return new CaractEdge(this);
		}


		// Getters e Setters.
		public Object getValor() {
			return this.Valor;
		}
		public Collor getCor() {
			return this.cor;
		}
<<<<<<< HEAD
		public boolean isDir() {
			return this.dir;
=======
		public boolean isBiDir() {
			return this.biDir;
>>>>>>> 705f4771ef3b16f67a194ec64209d3e1cf9be072
		}
		public Builder setValor(Object valor) {
			Valor = valor;
			return this;
		}
		public Builder setCor(Collor cor) {
			this.cor = cor;
			return this;
		}
<<<<<<< HEAD
		public Builder setBiDir(boolean dir) {
			this.dir = dir;
=======
		public Builder setBiDir(boolean biDir) {
			this.biDir = biDir;
>>>>>>> 705f4771ef3b16f67a194ec64209d3e1cf9be072
			return this;
		}
	}
	
}
