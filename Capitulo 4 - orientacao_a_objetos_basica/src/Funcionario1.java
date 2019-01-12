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

//Resultado irá dar o else, o operador "==" vai comparar o conteúdo das variáveis, mas as variáveis NÃO GUARDAM O OBJETO
//As variáveis guardam as REFERENCIAS, que apesar de estarem em um mesmo objeto, estão em espaços DIFERENTES na Memória
//Caso criar uma mesma referÊncia para um mesmo objeto, irá dar tilt. Ver ContaRefObj e contaRefObj2
