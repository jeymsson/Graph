
public class Node {

	/* Variaveis */
	Object obj;
	Node next, back;
	
	/* Construtores */
	public Node() {
		setObj(null);
		setNext(null);
		setBack(null);
	}
	public Node(Object obj) {
		setObj(obj);
		setNext(null);
		setBack(null);
	}
	public Node(Object obj, Node next) {
		setObj(obj);
		setNext(next);
		setBack(null);
	}
	public Node(Object obj, Node next, Node back) {
		setObj(obj);
		setNext(next);
		setBack(back);
	}

	/* Getters e Setters */
	public Object getObj() {
		return this.obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getBack() {
		return this.back;
	}
	public void setBack(Node back) {
		this.back = back;
	}

}
