class Funcionario {

	int numero;
	String nomeFuncionario;
	String departamento;
	double salario;
	String dataEntrada;
	String rG;
	double salarioAnual;
	
	void recebeAumento (double aumento){
		double NovoSalario = this.salario + aumento;
		this.salario = NovoSalario;
	}
	
	void calculoGanhoAnual(){
		double SalarioAnual = this.salario*12;
		this.salarioAnual = SalarioAnual;
	}
	
	void mostra(){
		System.out.println("Nome do funcionário:" + this.nomeFuncionario);
		System.out.println("salario atual:" + this.salario);
		System.out.println("salario anual:" + this.salarioAnual);
		System.out.println("Começo das atividades:" + this.dataEntrada);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Identificação:" + this.rG);
	}
	
}

class TestaFuncionario {
	
	public static void main(String [] args) {
		
		Funcionario f1 = new Funcionario ();
		
		f1.nomeFuncionario = "Álvaro";
		f1.salario = 9900.0;
		f1.recebeAumento (100);
		f1.calculoGanhoAnual();
		f1.dataEntrada = "08/06/1992";
		f1.departamento = "Derivativos e COE";
		f1.rG = "48.193.680-4";
		f1.mostra();
		
		
	}
}

