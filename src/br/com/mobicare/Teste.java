package br.com.mobicare;

public class Teste {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Funcionario f = new Funcionario();
		
		f.setName("Alexandre");
		f.setPosition("Estagi�rio");
		f.setSalary(1.200);
		f.setSector("Desenvolvimento2");
		f.setBusy(true);
		
		g.setName("Andr�");
		g.setSector("Desenvolvimento");
		g.workingWithBusy(f);
		
		
	}
}
