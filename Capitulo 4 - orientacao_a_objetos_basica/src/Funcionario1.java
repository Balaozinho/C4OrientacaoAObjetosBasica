class Funcionario1 {
	
	int numero;
	String nomeFuncionario;
	String departamento;
	double salario;
	double salarioAnual;
	String dataEntrada;
	String identificacaoRG;	

}

class TesteCompararFuncionario {
	public static void main (String [] args) {
		
		Funcionario1 f1 = new Funcionario1 ();
		f1.nomeFuncionario = "Danilo";
		f1.salario = 100;
		
		Funcionario1 f2 = new Funcionario1 ();
		f2.nomeFuncionario = "Danilo";
		f2.salario = 100;
		
	if( f1 == f2){
		System.out.println("iguais");
	}
	else{
		System.out.println("diferentes");
		}
	}
}

//Resultado ir� dar o else, o operador "==" vai comparar o conte�do das vari�veis, mas as vari�veis N�O GUARDAM O OBJETO
//As vari�veis guardam as REFERENCIAS, que apesar de estarem em um mesmo objeto, est�o em espa�os DIFERENTES na Mem�ria
//Caso criar uma mesma refer�ncia para um mesmo objeto, ir� dar tilt. Ver ContaRefObj e contaRefObj2
