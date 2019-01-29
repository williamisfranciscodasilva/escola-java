package escola;

public class Bolsista extends Aluno{
	
	private float bolsa;

	public Bolsista(String nm, int id, String sx) {
		super(nm, id, sx);
		
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa do aluno: "+this.getNome());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome()+" � bolsista! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
	}
