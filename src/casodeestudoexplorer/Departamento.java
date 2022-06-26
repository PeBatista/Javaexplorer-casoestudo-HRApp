package casodeestudoexplorer;

public class Departamento {
	private String nomeDepartamento;
	private Funcionario[] fun = new Funcionario[10];
	
	private int addFunIndex = -1;
	
	
	public Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	
	//Atingir sua capacidade de adicionar dados nos vetores da lista
	public void addFun(Funcionario anFuncionario) {
		if (addFunIndex < fun.length) {
			addFunIndex++;
			fun[addFunIndex] = anFuncionario;
		}
	}
	
	
	
	public Funcionario[] getFun() {
		Funcionario[] atualFuncionarios = new Funcionario[addFunIndex+1];
		for(int i = 0; i < atualFuncionarios.length; i++) {
			atualFuncionarios[i] = fun[i];
		}
		return atualFuncionarios;
	}
	
	public int getQtdFuncionario() {
		return addFunIndex+1;
	}
	
	public Funcionario getFuncionarioByID(int funid) {
		
		for (Funcionario fun: fun) {
			if(fun != null) {
				if(fun.getID() == (funid)) {
					return fun;
				}
			}
		}
		return null;
	}
	
	
	public double getTotalSalario() {
		double totalSalario = 0.0;
		for (int i = 0; i <= addFunIndex; i++) {
			totalSalario += fun[i].getSalario();
		}
		return totalSalario;
	}
	
	public double getMediaSalario() {
		if(addFunIndex > -1) {
			return getTotalSalario() / (addFunIndex+1);
		}
		return 0.0;
			
	}
	
	public String toString() {
		return nomeDepartamento;
	}
	
}
