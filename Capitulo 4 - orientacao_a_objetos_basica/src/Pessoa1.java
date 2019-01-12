class Pessoa1 {
	
	String nome;
	double idade;
	Data1 DataDeAniversario;
	
	
	void FazAniversario(){
		
		System.out.println("Nome do Aniversariante:" + this.nome);
		System.out.println("Idade:" + this.idade);
		System.out.println("Data de Aniversario é:" + this.DataDeAniversario.formatada());
		
	}
}

class Data1{
	
	int dia = 8;
	int mes = 06;
	int ano = 1992;
	String formatada () {
		return (dia+"/"+mes+"/"+ano);
	}
}

class FazAniversario {
	public static void main (String [] args){
		Pessoa1 P1 = new Pessoa1();
		
		P1.nome = "Álvaro";
		P1.idade = 25.0;
		
		Data1 data = new Data1();
		P1.DataDeAniversario = data;
		
		P1.FazAniversario();
		
	}
}