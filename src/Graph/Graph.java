package Graph;

import List.List;
import List.Node;
import Caracteristics.CaractGraph;
import Caracteristics.Types;

public class Graph {

	/* Variaveis */
	private CaractGraph info;
	private Vertice vRoot;
	private List allVertices;
	private List allEdges;
	private boolean log;

	/* Construtores */
	public Graph() {
		// TODO Auto-generated constructor stub
		setInfo(new CaractGraph());
		setRoot(null);
		setAllVertices(new List());
		setAllEdges(new List());
		setLog(false);
	}

	/* Metodos */
	private <G> boolean sendLog(G value) {
		if(getLog())
			System.out.println(value);
		return getLog();
	}
	private <G> boolean sendLogs(G value) {
		if(getLog())
			System.out.print(value);
		return getLog();
	}
	public boolean isEmpty() {
		if(getInfo().getNumVertices() == 0) {
			return true;
		} else {
			return false;
		}
	}
	public void setOrigin(Vertice v) {
		if (v == null) {
			sendLog("Graph.newVertice: Vertice empty.");
		} else {
			if (isEmpty()) {
				setRoot(v);
			}
			getAllVertices().pushI(v);
			
			getInfo().setNumVertices(getInfo().getNumVertices() +1);
		}
	}
	public Vertice getOrigin() {
		return getRoot();
	}
	public void printAllVertices() {
		Node temp = getAllVertices().getHead();
		Vertice value = null;

		value = (Vertice) temp.getObj();
		sendLogs(value.getInfo().getValor());
		while (temp.getNext() != null) {
			temp = temp.getNext();
			value = (Vertice) temp.getObj();
			sendLogs(", "+ value.getInfo().getValor());
		}
		sendLog("");
	}
	public void printAllEdges() {
		Node temp = getAllEdges().getHead();
		Edge value = null;
		while (temp.getNext().getNext() != null) {
			value = (Edge) temp.getObj();
			sendLogs(value.getInfo().getValor() +", ");
			temp = temp.getNext();
		}
		value = (Edge) temp.getObj();
		sendLog(value.getInfo().getValor());
	}
	public Vertice findVerticeValue(Object value) {
		Node temp = getAllVertices().getHead();
		Vertice vertTemp = null;
		String vertValue = null;
		while (temp != null) {
			vertTemp = (Vertice) temp.getObj();
			vertValue = (String) vertTemp.getInfo().getValor();
			if(vertValue.equals((String)value)) {
				break;
			}
			temp = temp.getNext();
		}
		if(vertValue.equals((String)value)) {
			return vertTemp;
		} else {
			return null;			
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
	public boolean getLog() {
		return this.log;
	}
	public void setLog(boolean log) {
		this.log = log;
	}

}
