class ContaRefObj2 {
	
	double salario;
	int numero;
	String dono;
	double saldo;
	double limite;
	
}

class Metodos6 {
	
	public static void main(String [] args){
		
		ContaRefObj2 minhaConta1 = new ContaRefObj2 ();
		minhaConta1.dono = "�lvaro";
		minhaConta1.saldo = 1000.0;	
		
		ContaRefObj2 minhaConta2 = new ContaRefObj2 (); 
		minhaConta2.dono = "�lvaro";
		minhaConta2.saldo = 1000.0;
		
		if(minhaConta1 == minhaConta2){
			System.out.println("Contas Iguais");
			}
		else{
			System.out.println("Deu erro cuzao");
		}
	}
}

// Operador == comprar o conte�do das vari�veis, mas as vari�veis declaradas n�o guardam o objeto, mas sim a sua REFERENCIA (as quais s�o diferentes)
// Estao em espacos diferentes da memoria. Contas equivalentes no criterio de igualdade, por�m n�o s�o o mesmo objeto!
// Portanto, o operador compara os objetos, que neste caso, s�o diferentes!! Retornando o Else.
