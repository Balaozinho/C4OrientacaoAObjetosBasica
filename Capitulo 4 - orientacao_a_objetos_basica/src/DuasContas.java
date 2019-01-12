class DuasContas {
	
	double salario;
	int numero;
	String dono;
	double saldo;
	double limite;
	
	
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

class Metodos4 {
	
	public static void main(String [] args){
		
		DuasContas minhaConta1;
		minhaConta1 = new DuasContas ();
		minhaConta1.saldo = 1000.0;
		
		//criação de uma nova conta 
		
		
		DuasContas minhaConta2;
		minhaConta2 = new DuasContas ();
		minhaConta2.saldo = 2000.0;
		
		
		if(minhaConta1.retirada(1200)){
			System.out.println("Retirada da conta 1 realizada com sucesso");
		}
		else{
			System.out.println("Falha.Retirada maior que o saldo da conta 1");
		}
		
		if(minhaConta2.retirada(3000)){
			System.out.println("Retirada da conta 2 realizada com sucesso");
		}
		else{
			System.out.println("Falha.Retirada maior que o saldo da conta 2");
		}
		
		}
	}

