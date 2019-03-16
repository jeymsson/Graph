package List;

public class List {

	/* Variaveis */
	private Node head, tail;
	private int numNodes;
	private boolean log;
	
	/* Construtores */
	public List() {
		setNumNodes(0);
		setHead(null);
		setTail(null);
		setLog(false);
	}
	
	/* Getters e Setters */
	public Node getHead() {
		return this.head;
	}
	private Node setHead(Node head) {
		this.head = head;
		return getHead();
	}
	public Node getTail() {
		return this.tail;
	}
	private Node setTail(Node tail) {
		this.tail = tail;
		return getTail();
	}
	public int getNumNodes() {
		return this.numNodes;
	}
	private int setNumNodes(int numNodes) {
		this.numNodes = numNodes;
		return getNumNodes();
	}
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
	public boolean getLog() {
		return this.log;
	}
	public boolean setLog(boolean log) {
		this.log = log;
		return getLog();
	}

	/* Metodos */
	public boolean isEmpty() {
		if (getNumNodes() == 0) {
			return true;			
		} else {
			return false;
		}
	}
	public <G> void pushI(G value) {
		Node n;
		if (isEmpty()) {
			n = new Node(value);
			setHead(n);
			setTail(n);
		} else {
			n = new Node(value, getHead(), null);
			getHead().setBack(n);
			setHead(n);
		}
		setNumNodes(getNumNodes() +1);
	}
	public <G> void pushL(G value) {
		Node n;
		if (isEmpty()) {
			n = new Node(value);
			setHead(n);
			setTail(n);
		} else {
			n = new Node(value, null, getTail());
			getTail().setNext(n);
			setTail(n);
		}
		setNumNodes(getNumNodes() +1);
	}
	public Node popI() {
		Node ret = null;
		if (isEmpty()) {
			sendLog("List.popI: List is empty.");
		} else if(getNumNodes() == 1){
			ret = getHead();
			setHead(null);
			setTail(null);
			setNumNodes(getNumNodes() -1);
		} else {
			ret = getHead();
			setHead(getHead().getNext()).setBack(null);
			ret.setNext(null);
			setNumNodes(getNumNodes() -1);
		}
		return ret;
	}
	public Node popL() {
		Node ret = null;
		if (isEmpty()) {
			sendLog("List.popL: List is empty.");
		} else if(getNumNodes() == 1){
			ret = getHead();
			setHead(null);
			setTail(null);
			setNumNodes(getNumNodes() -1);
		} else {
			ret = getTail();
			setTail(getTail().getBack()).setNext(null);
			ret.setBack(null);
			setNumNodes(getNumNodes() -1);
		}
		return ret;
	}
	public void printValues() {
		Node temp = getHead();
		while (temp != null) {
			sendLogs(", "+temp.obj);
			temp = temp.getNext();
		}
	}

}
