package Graph;

import Caracteristics.CaractEdge;

public class Edge {

	/* Variaveis */
	private CaractEdge info;
	private Arrow setaO, setaD;

	/* Construtores */
	public Edge(Arrow origem, Arrow detino) {
		// TODO Auto-generated constructor stub
		setInfo(new CaractEdge());
		setSetaO(origem);
		setSetaD(detino);
	}
	public Edge(Vertice origem, Vertice detino) {
		// TODO Auto-generated constructor stub
		setInfo(new CaractEdge());
		setSetaO(new Arrow.Builder().setVertice(origem).Build());
		setSetaD(new Arrow.Builder().setVertice(detino).Build());
	}
	public Edge(Vertice origem, Arrow detino) {
		// TODO Auto-generated constructor stub
		setInfo(new CaractEdge());
		setSetaO(new Arrow.Builder().setVertice(origem).Build());
		setSetaD(detino);
	}
	public Edge(Arrow origem, Vertice detino) {
		// TODO Auto-generated constructor stub
		setInfo(new CaractEdge());
		setSetaO(origem);
		setSetaD(new Arrow.Builder().setVertice(detino).Build());
	}


	/* Getters e Setters */
	public Arrow getSetaO() {
		return this.setaO;
	}
	public void setSetaO(Arrow setaO) {
		this.setaO = setaO;
	}
	public CaractEdge getInfo() {
		return this.info;
	}
	public void setInfo(CaractEdge info) {
		this.info = info;
	}
	public Arrow getSetaD() {
		return this.setaD;
	}
	public void setSetaD(Arrow setaD) {
		this.setaD = setaD;
	}

}
