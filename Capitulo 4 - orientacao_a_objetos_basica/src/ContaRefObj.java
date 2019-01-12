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
		
		
		ContaRefObj minhaConta2 = minhaConta1; //perceba que aqui dizemos que a ref será dada para o mesmo objeto! Pois M1 = M2
		minhaConta2.saldo = 2000.0;
		minhaConta2.deposita(500);
		
		System.out.println(minhaConta1.saldo);
		System.out.println(minhaConta2.saldo);
	}
}

//O valor retornado será o mesmo para ambas as contas, pois a referência foi dada para o mesmo objeto!
//No caso, são referências distintas, mas apontam para um mesmo objeto ContaRefObj. Sendo assim, a linha 31 deveria ser escrita como ContaRefObj minhaConta2 = new ContaRefObj ();

//O que faz o new? depois de alocar a memória para esse objeto, devolve uma "flecha", isto é, um valor de referência. Quando você atribui isso a uma variável, essa variável passa a se referir para esse mesmo objeto.
