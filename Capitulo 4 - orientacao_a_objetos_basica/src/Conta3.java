class Conta3 {
	
	double salario;
	int numero;
	String dono;
	double saldo;
	double limite;

	//atributos da classe Conta3
	
	//Abaixo s�o os met�dos via condi��es booleanas
	
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
		
		minhaConta.dono = "�lvaro";
		minhaConta.saldo = 1000.0;
		
		//Elimando vari�vel tempor�ria da linha boolean "consegui = minhaConta.retirada(500);"
		//Sem vari�vel tempor�ria, acesso ao m�todo de retirada diretamente, quantidade indicada entre parenteses.
		//S� ir� executar esta linha se a condi��o booleana for atendida, caso contr�rio, n�o conseguir�
		
		
		if (minhaConta.retirada(1000)){
			System.out.println("Consegui Sacar");
		}
		else{
			System.out.println("N�o consegui sacar");
		}
	}
}

	


