package Caracteristics;

import Graph.Edge;

public class CaractVertice {
	private Object Valor;
	private Types tipo;
	private Collor cor;
	private float distancia;
	private int timeI, timeF;
	private Edge Pai;

	public CaractVertice() {
		// TODO Auto-generated constructor stub
	}
	public CaractVertice(Builder b) {
		// TODO Auto-generated constructor stub
		this.Valor = b.getValor();
		this.cor = b.getCor();
		this.distancia = b.getDistancia();
		this.timeI = b.getTimeI();
		this.timeF = b.getTimeF();
		this.Pai = b.getPai();
		this.tipo = Types.Vertice;
	}


	// Getters e Setters.
	public Object getValor() {
		return this.Valor;
	}
	public Collor getCor() {
		return this.cor;
	}
	public float getDistancia() {
		return this.distancia;
	}
	public int getTimeI() {
		return this.timeI;
	}
	public int getTimeF() {
		return this.timeF;
	}
	public void setValor(Object valor) {
		this.Valor = valor;
	}
	public void setCor(Collor cor) {
		this.cor = cor;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public void setTimeI(int timeI) {
		this.timeI = timeI;
	}
	public void setTimeF(int timeF) {
		this.timeF = timeF;
	}
	public Edge getPai() {
		return Pai;
	}
	public void setPai(Edge pai) {
		Pai = pai;
	}
	public static class Builder {
		private Object Valor;
		private Collor cor;
		private float distancia;
		private int timeI, timeF;
		private Edge Pai;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public CaractVertice Build() {
			return new CaractVertice(this);
		}


		// Getters e Setters.
		public Object getValor() {
			return this.Valor;
		}
		public Collor getCor() {
			return this.cor;
		}
		public float getDistancia() {
			return this.distancia;
		}
		public int getTimeI() {
			return this.timeI;
		}
		public int getTimeF() {
			return this.timeF;
		}
		public Edge getPai() {
			return Pai;
		}
		public Builder setValor(Object valor) {
			this.Valor = valor;
			return this;
		}
		public Builder setCor(Collor cor) {
			this.cor = cor;
			return this;
		}
		public Builder setDistancia(float distancia) {
			this.distancia = distancia;
			return this;
		}
		public Builder setTimeI(int timeI) {
			this.timeI = timeI;
			return this;
		}
		public Builder setTimeF(int timeF) {
			this.timeF = timeF;
			return this;
		}
		public Builder setPai(Edge pai) {
			Pai = pai;
			return this;
		}
	}
	
}
