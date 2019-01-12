class ContaRefObj {
	
	double salario;
	int numero;
	String dono;
	double saldo;
	double limite;
	
	
	boolean deposita(double quantidade){
		
		if(quantidade < 0){
			return false;
		}
		else{
			this.saldo = this.saldo + quantidade;
			return true;
		}
	}
}

class Metodos5 {
	
	public static void main(String [] args){
		
		ContaRefObj minhaConta1 = new ContaRefObj ();
		minhaConta1.saldo = 1000.0;
		minhaConta1.deposita(100);
		
		
		ContaRefObj minhaConta2 = minhaConta1; //perceba que aqui dizemos que a ref ser� dada para o mesmo objeto! Pois M1 = M2
		minhaConta2.saldo = 2000.0;
		minhaConta2.deposita(500);
		
		System.out.println(minhaConta1.saldo);
		System.out.println(minhaConta2.saldo);
	}
}

//O valor retornado ser� o mesmo para ambas as contas, pois a refer�ncia foi dada para o mesmo objeto!
//No caso, s�o refer�ncias distintas, mas apontam para um mesmo objeto ContaRefObj. Sendo assim, a linha 31 deveria ser escrita como ContaRefObj minhaConta2 = new ContaRefObj ();

//O que faz o new? depois de alocar a mem�ria para esse objeto, devolve uma "flecha", isto �, um valor de refer�ncia. Quando voc� atribui isso a uma vari�vel, essa vari�vel passa a se referir para esse mesmo objeto.
