package escola;

public class Professor extends Pessoa {
	public Professor(String nm, int id, String sx) {
		super(nm, id, sx);
	}
	private String especialidade;
	private float salario;
	
	public void receberAum(float aum) {
		this.salario += aum;
	}
	
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String ep) {
		this.especialidade = ep;
	}
	
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float sl) {
		this.salario = sl;
	}
}
