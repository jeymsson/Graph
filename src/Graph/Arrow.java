package Graph;

public class Arrow {

	private Vertice vertice;
	private boolean seta;
	public Arrow() {
		setSeta(false);
		setVertice(null);
	}
	
	public Vertice getVertice() {
		return vertice;
	}
	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}
	public boolean isSeta() {
		return seta;
	}
	public void setSeta(boolean seta) {
		this.seta = seta;
	}

}
