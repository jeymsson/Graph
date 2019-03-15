package Graph;

import List.List;
import Caracteristics.CaractGraph;

public class Graph {

	/* Variaveis */
	private CaractGraph info;
	private Vertice vRoot;
	private List allVertices;
	private List allEdges;

	/* Construtores */
	public Graph() {
		// TODO Auto-generated constructor stub
		setInfo(new CaractGraph());
		setRoot(null);
		setAllVertices(new List());
		setAllEdges(new List());
	}

	/* Metodos */
	public boolean isEmpty() {
		if(getInfo().getNumVertices() == 0) {
			return true;
		} else {
			return false;
		}
	}
	/* Getters e Setters */
	public List getAllVertices() {
		return this.allVertices;
	}
	public void setAllVertices(List vertices) {
		this.allVertices = vertices;
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
	public List getAllEdges() {
		return this.allEdges;
	}
	public void setAllEdges(List edges) {
		this.allEdges = edges;
	}

}
