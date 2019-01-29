package escola;

public class Aluno extends Pessoa {
	public Aluno(String nm, int id, String sx) {
		super(nm, id, sx);
	}
	private int matr;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando a mensalidade do aluno: "+this.getNome());
	}
	public void cancelarMatr() {
		System.out.println("Matrícula será cancelada!");
	}
	
	
	public int getMatr() {
		return this.matr;
	}
	public void setMatr(int mt) {
		this.matr = mt;
	}
	
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String cs) {
		this.curso = cs;
	}
}
