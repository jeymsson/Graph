
public class List {

	/* Variaveis */
	Node head, tail;
	int numNodes;
	
	/* Construtores */
	public List() {
		setNumNodes(0);
		setHead(null);
		setTail(null);
	}
	
	/* Getters e Setters */
	public Node getHead() {
		return this.head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return this.tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getNumNodes() {
		return this.numNodes;
	}
	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	/* Metodos */
	boolean isEmpty() {
		if (getNumNodes() == 0) {
			return true;			
		} else {
			return false;
		}
	}

}
