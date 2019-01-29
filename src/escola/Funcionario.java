package escola;

public class Funcionario extends Pessoa {
	public Funcionario(String nm, int id, String sx) {
		super(nm, id, sx);
	}
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String st) {
		this.setor = st;
	}
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	public void setNome(boolean tb) {
		this.trabalhando = tb;
	}

}
