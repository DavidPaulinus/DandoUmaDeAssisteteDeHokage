
public class Gennin extends Ninja {
	private String missoes;
	private String rank;
	private int numMissoes;
	
	
	public Gennin(String nome, String aldeia, String missoes, String rank, int numMissoes) {
		super(nome, aldeia);
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
