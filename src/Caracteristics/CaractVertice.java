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
		public void setValor(Object valor) {
			this.Valor = valor;
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
		public float getDistancia() {
			return this.distancia;
		}
		public void setDistancia(float distancia) {
			this.distancia = distancia;
		}
		public int getTimeI() {
			return this.timeI;
		}
		public void setTimeI(int timeI) {
			this.timeI = timeI;
		}
		public int getTimeF() {
			return this.timeF;
		}
		public void setTimeF(int timeF) {
			this.timeF = timeF;
		}
	}
	
}
