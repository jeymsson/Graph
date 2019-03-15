package Caracteristics;

import Graph.Arrow;

public class CaractEdge {
	private Object Valor;
	private Collor cor;
	private Types tipo;
	private Arrow setaO, setaD;

	public CaractEdge() {
		// TODO Auto-generated constructor stub
		this.tipo = Types.Edge;
	}
	public CaractEdge(Builder b) {
		// TODO Auto-generated constructor stub
		this.Valor = b.getValor();
		this.cor = b.getCor();
		this.setaO = b.getSetaO();
		this.setaD = b.getSetaD();
		this.tipo = Types.Edge;
	}
	
	
	
	public static class Builder {
		private Object Valor;
		private Collor cor;
		private Arrow setaO, setaD;
		
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
		public void setValor(Object valor) {
			Valor = valor;
		}
		public Collor getCor() {
			return this.cor;
		}
		public void setCor(Collor cor) {
			this.cor = cor;
		}
		public Arrow getSetaO() {
			return setaO;
		}
		public void setSetaO(Arrow setaO) {
			this.setaO = setaO;
		}
		public Arrow getSetaD() {
			return setaD;
		}
		public void setSetaD(Arrow setaD) {
			this.setaD = setaD;
		}
	}
	
}
