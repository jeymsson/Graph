package Graph;

import List.List;
import Caracteristics.CaractGraph;

public class Graph {

	/* Variaveis */
	private CaractGraph info;
	private Vertice vRoot;
	private List vertices;
	private List edges;

	/* Construtores */
	public Graph() {
		// TODO Auto-generated constructor stub
		setInfo(new CaractGraph());
		setRoot(null);
		setVertices(new List());
	}

	/* Metodos */
	/* Getters e Setters */
	public List getVertices() {
		return this.vertices;
	}
	public void setVertices(List vertices) {
		this.vertices = vertices;
	}
	public CaractGraph getInfo() {
		return this.info;
	}
	public void setInfo(CaractGraph info) {
		this.info = info;
	}
	public Vertice getRoot() {
		return this.vRoot;
	}
	public void setRoot(Vertice vRoot) {
		this.vRoot = vRoot;
	}
	public List getEdges() {
		return this.edges;
	}
	public void setEdges(List edges) {
		this.edges = edges;
	}

}
