
public class Test {

	public static void main(String[] args) {
		Node no = new Node();
		int i = 2;
		Node noN = new Node(i);
		Node noB = new Node(null, no, noN);
		System.out.println("Fim");
	}

}
