package br.com.mobicare;

public class Gerente extends Funcionario {
	
	private Integer numberOfEmployees;
	private String sector;
	
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public void dimissEmployee(Funcionario funcionario) {
		
		if(funcionario.getSalary() < 10.000) {
			System.out.println(funcionario.getName() + "Foi Demitido");
		}else {
			System.out.println(funcionario.getName() + "Não foi Demitido");
		}
	}
	public void workingWithBusy(Funcionario funcionario) {
		
		if(funcionario.isBusy() == true && funcionario.getSector().equals(this.sector) || funcionario.isBusy() == false && funcionario.getSector().equals(this.sector)) {
			
			System.out.println( this.getName()+" e "  +funcionario.getName()+"  estão trabalhando juntos");
		}else {
			
			System.out.println("Talvez o setor esteja errado ");
		}
	}
	

}
