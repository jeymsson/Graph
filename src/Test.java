import Caracteristics.Collor;
import Caracteristics.Types;
import Graph.Edge;
import Graph.Graph;
import Graph.Vertice;
import List.Node;

public class Test {

	public static void main(String[] args) {
		Vertice v = new Vertice("A");
		Graph g = new Graph();
		g.setOrigin(v);
		Vertice o = g.getOrigin();
		g.setLog(true);
		
		

		Vertice b = new Vertice("B");
		Vertice c = new Vertice("C");
		Vertice d = new Vertice("D");
		Vertice e = new Vertice("E");
		Vertice f = new Vertice("F");
		Vertice gv = new Vertice("G");
		Vertice h = new Vertice("H");
		Vertice i = new Vertice("I");
		Vertice j = new Vertice("J");
		
		o.newVerticeDir(g, b);
		o.newVerticeDir(g, c);
		o.newVerticeDir(g, d);
		b.newVerticeDir(g, e);
		f.newVerticeDir(g, b);
		c.newVerticeDir(g, gv);
		d.newVertice(g, h);
		d.newVerticeDir(g, i);
		j.newVerticeDir(g, d);
		
		g.printAllVertices();
//		g.printValues(Types.Edge);
		printGraph(g);
		System.out.println("Fim");
	}
	
	public static void printGraph(Graph g){
		if (g.isEmpty()) {
		} else {
			printGraph(g.getOrigin());
		}
	}
	private static void printGraph(Vertice v){
		if (v == null) {
		} 
		else if(v.getInfo().getCor() != Collor.Black) {
			System.out.print(" ("+v.getInfo().getValor());
			v.getInfo().setCor(Collor.Black);
			
			Edge edge = null; Vertice vert = null;
			Node temp = v.getEdges().getHead();
			boolean b1, b2;
			while (temp != null) {
				edge = (Edge) temp.getObj();
				vert = edge.getSetaD().getVertice();
				printGraph(vert);
				System.out.print(")");
				temp = temp.getNext();
			}
		}
	}

}

