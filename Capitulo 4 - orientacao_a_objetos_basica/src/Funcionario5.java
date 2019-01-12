

class Funcionario5 {
	
	int numero;
	String nomeFuncionario;
	String departamento;
	double salario;
	double salarioAnual;
	String identificacaoRG;	
	Data dataDeEntrada;
	
	void mostra () {
	
		System.out.println("Nome: " + this.nomeFuncionario);
		System.out.println("Salario: " + this.salario);
		
		System.out.println("Dia: " + this.dataDeEntrada.formatada());
		
		//acessou o atributo DataDeEntrada que acessou a string da classe Data, com os respectivos valores de dia, mes e ano indicados
					
			}

		}

class Data{
	
	int dia = 15;
	int mes = 07;
	int ano = 2017;
	String formatada () {
		return (dia+"/"+mes+"/"+ano);
	}
}

class AtribuiData {
	public static void main (String [] args) {
		
		Funcionario5 f1 = new Funcionario5 ();
		f1.nomeFuncionario = "Danilo";
		f1.salario = 100; 
		
		Data data = new Data();
		f1.dataDeEntrada = data;
		
		f1.mostra();
		
//Se jogar o método "mostra" antes de criar o objeto "Data", vai dar erro. A classe "Data" está separada do bloco da classe Funcionario5, logo, possuem referências diferentes.
//Antes de chamar o método, deve-se criar a segunda referencia, que diz respeito a classe Data		
		
	}
}

