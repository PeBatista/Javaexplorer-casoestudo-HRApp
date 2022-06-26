package casodeestudoexplorer;

public class Funcionario {
	private int ID;
	private String nomeFuncionario;
	private double salario;
	
	public Funcionario(int iD, String nomeFuncionario, double salario) {
		super();
		ID = iD;
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public String toString() {
	return "Funcionario: " + getID() + " " + getNomeFuncionario() + " " + getSalario();
	}
}

