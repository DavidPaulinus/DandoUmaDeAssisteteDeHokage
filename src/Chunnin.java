
public class Chunnin extends Ninja {
	private boolean liderEsquad;
	private String missoes;
	private String rank;
	private int numMissoes;
	
	
	public Chunnin(String nome, String aldeia, boolean liderEsquad, String missoes, String rank, int numMissoes) {
		super(nome, aldeia);
		
	}
	
	
	public boolean isLiderEsquad() {
		return liderEsquad;
	}
	public void setLiderEsquad(boolean liderEsquad) {
		this.liderEsquad = liderEsquad;
	}
	
	public String getMissoes() {
		return missoes;
	}
	public void setMissoes(String missoes) {
		this.missoes = missoes;
	}
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public int getNumMissoes() {
		return numMissoes;
	}
	public void setNumMissoes(int numMissoes) {
		this.numMissoes = numMissoes;
	}
	
	
}
