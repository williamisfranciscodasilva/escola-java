package escola;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniv() {
		this.idade++;
	}
	
	public Pessoa(String nm, int id, String sx) {
		this.nome = nm;
		this.idade = id;
		this.sexo = sx;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public void setNome(String nm) {
		this.nome = nm;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sx) {
		this.sexo = sx;
	}
	
}
