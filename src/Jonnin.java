
public class Jonnin extends Ninja {
	private boolean sensei;
	private String missoes;
	private String rank;
	private int numMissoes;
	
	
	public Jonnin(String nome, String aldeia, boolean sensei, String missoes, String rank, int numMissoes) {
		super(nome, aldeia);
	}
	
	
	public boolean isSensei() {
		return sensei;
	}
	public void setSensei(boolean sensei) {
		this.sensei = sensei;
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
