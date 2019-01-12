class Conta3 {
	
	double salario;
	int numero;
	String dono;
	double saldo;
	double limite;

	//atributos da classe Conta3
	
	//Abaixo são os metódos via condições booleanas
	
	boolean retirada(double quantidade){
		if(this.saldo < quantidade){
			return false;
		}
		else{
			this.saldo = this.saldo - quantidade;
			return true;
		}
	}
}

class Metodos3 {
	
	public static void main (String [] args){
		
		Conta3 minhaConta;
		minhaConta = new Conta3 ();
		
		minhaConta.dono = "Álvaro";
		minhaConta.saldo = 1000.0;
		
		//Elimando variável temporária da linha boolean "consegui = minhaConta.retirada(500);"
		//Sem variável temporária, acesso ao método de retirada diretamente, quantidade indicada entre parenteses.
		//Só irá executar esta linha se a condição booleana for atendida, caso contrário, não conseguirá
		
		
		if (minhaConta.retirada(1000)){
			System.out.println("Consegui Sacar");
		}
		else{
			System.out.println("Não consegui sacar");
		}
	}
}

	


