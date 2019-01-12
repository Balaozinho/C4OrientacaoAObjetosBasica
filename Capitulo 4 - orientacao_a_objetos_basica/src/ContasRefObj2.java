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
		minhaConta1.dono = "Álvaro";
		minhaConta1.saldo = 1000.0;	
		
		ContaRefObj2 minhaConta2 = new ContaRefObj2 (); 
		minhaConta2.dono = "Álvaro";
		minhaConta2.saldo = 1000.0;
		
		if(minhaConta1 == minhaConta2){
			System.out.println("Contas Iguais");
			}
		else{
			System.out.println("Deu erro cuzao");
		}
	}
}

// Operador == comprar o conteúdo das variáveis, mas as variáveis declaradas não guardam o objeto, mas sim a sua REFERENCIA (as quais são diferentes)
// Estao em espacos diferentes da memoria. Contas equivalentes no criterio de igualdade, porém não são o mesmo objeto!
// Portanto, o operador compara os objetos, que neste caso, são diferentes!! Retornando o Else.
