package escola;

public class MainProgram {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(null, 0, null);
		Bolsista b1 = new Bolsista(null, 0, null);
		Funcionario p3 = new Funcionario(null, 0, null);
		Professor p4  = new Professor(null, 0, null);
		Visitante v1 = new Visitante(null, 0, null);
		
		v1.setNome("Juvenal");
		v1.setSexo("Masculino");
		v1.setIdade(37);
		
		a1.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p4.setSexo("Feminino");
		
		a1.setIdade(25);
		
		a1.setCurso("Informática");
		p4.setSalario(5555.55f);
		
		a1.pagarMensalidade();
		b1.setMatr(2568);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("Masculino");
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		System.out.println(v1.toString());
		System.out.println(a1.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
