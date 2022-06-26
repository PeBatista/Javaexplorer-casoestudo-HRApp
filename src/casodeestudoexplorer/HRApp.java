package casodeestudoexplorer;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("HRApp iniciado");
		
		Funcionario Pedro = new Funcionario(1, "Pedro", 11000); 
		Funcionario Gracy = new Funcionario(2, "Gracy", 12000); 
		
		Departamento dept = new Departamento("Tecnologia da Informacao");
		
		dept.addFun(Pedro); // ADD os funcionários ao DEPTO
		dept.addFun(Gracy);
		dept.addFun(new Funcionario(3, "Luda Cris", 2500));
		
		Funcionario[] funs = dept.getFun();
		
		for(Funcionario fun: funs) {
			System.out.println("Fun: " + fun); // 2 FUNCIONARIOS GUARDADOS EM 1 PRÓPRIO ARRAY
			//System.out.println(Gracy);
		}
//		System.out.println(Pedro); // MOSTRANDO OS DADOS DO FUNCIONARIO
//		System.out.println(Gracy);
		
		//MOSTRANDO O TOTAL DE SALARIOS E MEDIA
		System.out.println("Total de salario: " + dept.getTotalSalario());
		System.out.println("Media salarial: " + dept.getMediaSalario());
		
		System.out.println("Fun: " + dept.getFuncionarioByID(4)); // ACHANDO O FUNCIONMARIO PELO ID
		
	}

}
