package Caracteristics;

public class CaractVertice {
	private Object Valor;
	private Types tipo;
	private Collor cor;
	private float distancia;
	private int timeI, timeF;

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
		this.tipo = Types.Vertice;
	}
	
	
	
	public static class Builder {
		private Object Valor;
		private Types tipo;
		private Collor cor;
		private float distancia;
		private int timeI, timeF;
		
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
		public Builder setValor(Object valor) {
			this.Valor = valor;
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
		public float getDistancia() {
			return this.distancia;
		}
		public Builder setDistancia(float distancia) {
			this.distancia = distancia;
			return this;
		}
		public int getTimeI() {
			return this.timeI;
		}
		public Builder setTimeI(int timeI) {
			this.timeI = timeI;
			return this;
		}
		public int getTimeF() {
			return this.timeF;
		}
		public Builder setTimeF(int timeF) {
			this.timeF = timeF;
			return this;
		}
	}
	
}
