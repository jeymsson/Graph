package Graph;

import Caracteristics.CaractEdge;
import Caracteristics.Collor;

public class Arrow {

	/* Variaveis */
	private Vertice vertice;
	private boolean seta;

	/* Construtores */
	public Arrow(Builder b) {
		this.seta = b.isSeta();
		this.vertice = b.getVertice();
	}

	// Getters e Setters.
	public Vertice getVertice() {
		return this.vertice;
	}
	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}
	public boolean isSeta() {
		return this.seta;
	}
	public void setSeta(boolean seta) {
		this.seta = seta;
	}
	public static class Builder {
		private Vertice vertice;
		private boolean seta;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}
		public Arrow Build() {
			return new Arrow(this);
		}


		// Getters e Setters.
		public Vertice getVertice() {
			return this.vertice;
		}
		public Builder setVertice(Vertice vertice) {
			this.vertice = vertice;
			return this;
		}
		public boolean isSeta() {
			return this.seta;
		}
		public Builder setSeta(boolean seta) {
			this.seta = seta;
			return this;
		}
	}

}
