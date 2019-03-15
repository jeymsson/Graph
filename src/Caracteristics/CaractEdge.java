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
		public boolean isDir() {
			return this.dir;
		}
		public Builder setValor(Object valor) {
			Valor = valor;
			return this;
		}
		public Builder setCor(Collor cor) {
			this.cor = cor;
			return this;
		}
		public Builder setBiDir(boolean dir) {
			this.dir = dir;
			return this;
		}
	}
	
}
