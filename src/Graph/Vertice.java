package Graph;

import Caracteristics.CaractVertice;
import List.List;
import List.Node;

public class Vertice {

	/* Variaveis */
	private CaractVertice info;
	private List edges;
	private boolean log;

	/* Construtores */
	public Vertice() {
		// TODO Auto-generated constructor stub
		setLog(false);
		setEdges(new List());
		setInfo(new CaractVertice());
	}
	public Vertice(Object Value) {
		// TODO Auto-generated constructor stub
		setLog(false);
		setEdges(new List());
		setInfo(new CaractVertice());
		getInfo().setValor(Value);
	}


	/* Metodos */
	private <G> boolean sendLog(G value) {
		if(getLog())
			System.out.println(value);
		return getLog();
	}
	public void newVertice(Graph g, Vertice v) {
		if (v == null) {
			sendLog("Vertice.newVertice: Vertice empty.");
		} else {
			if (g.isEmpty()) {
				g.setRoot(v);
			}
			Edge nE = new Edge(this, v);
			getEdges().pushL(nE);

			Vertice temp;
			temp = g.findVerticeValue(v.getInfo().getValor());
			if(temp == null) {
				g.getAllVertices().pushL(v);
			}
				// Certificando que vertices não acessáveis participem do grafo.
				temp = g.findVerticeValue(this.getInfo().getValor());
				if(temp == null) {
					g.getAllVertices().pushL(this);
				}

			g.getAllEdges().pushL(nE);

			g.getInfo().setNumVertices(g.getInfo().getNumVertices() +1);
			g.getInfo().setNumEdges(g.getInfo().getNumEdges() +1);
		}
	}
	public void newVerticeDir(Graph g, Vertice v) {
		if (v == null) {
			sendLog("Vertice.newVerticeDir: Vertice empty.");
		} else {
			if (g.isEmpty()) {
				g.setRoot(v);
			}
			Edge nE = new Edge( this
								, new Arrow.Builder()
									.setSeta(true)
									.setVertice(v).Build());
			nE.getInfo().setDir(true);
			getEdges().pushL(nE);
			
			Vertice temp;
			temp = g.findVerticeValue(v.getInfo().getValor());
			if(temp == null) {
				g.getAllVertices().pushL(v);
			}
				// Certificando que vertices não acessáveis participem do grafo.
				temp = g.findVerticeValue(this.getInfo().getValor());
				if(temp == null) {
					g.getAllVertices().pushL(this);
				}

			g.getAllEdges().pushL(nE);
			
			g.getInfo().setNumVertices(g.getInfo().getNumVertices() +1);
			g.getInfo().setNumEdges(g.getInfo().getNumEdges() +1);
			g.getInfo().setNumEdgesDir(g.getInfo().getNumEdgesDir() +1);
		}
	}
	public List getSons() {
		return getEdges();
	}
	
	/* Getters e Setters */
	public CaractVertice getInfo() {
		return this.info;
	}
	public void setInfo(CaractVertice info) {
		this.info = info;
	}
	public List getEdges() {
		return this.edges;
	}
	public void setEdges(List edges) {
		this.edges = edges;
	}
	public boolean getLog() {
		return this.log;
	}
	public void setLog(boolean log) {
		this.log = log;
	}

}
