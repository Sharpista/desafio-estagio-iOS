package br.com.mobicare;

public class Funcionario {

	private String name;
	private String sector;
	private String position;
	private double salary;
	private boolean busy;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSector() {
		return sector;
	}



	public void setSector(String sector) {
		this.sector = sector;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public boolean isBusy() {
		return busy;
	}



	public void setBusy(boolean busy) {
		this.busy = busy;
	}



	public boolean iSBusy() {
		
		if(busy == true) {
			System.out.println("Funcionario Aterefado");
		}
		else {
			System.out.println("Funcinario sem Tarefas");
		}
		return busy;
		
	}
}
