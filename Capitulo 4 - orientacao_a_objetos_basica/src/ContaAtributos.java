class Cliente{
	
	String nome;
	String sobrenome;
	String CPF;
	
}

class ContaAtributos {
	
	int numero;
	double saldo;
	double limite;
	Cliente titular;

//Caso adicionado algo nas variáveis de atributo, o sistema adotará como valor de default
//Neste caso, ao criar uma conta, as variáveis já estarão "populadas"
	
}

class Teste {
	public static void main (String [] args) {
		ContaAtributos minhaConta = new ContaAtributos ();
		Cliente c = new Cliente ();
		minhaConta.titular = c;
	}
}
//O valor da varíavel "c" foi copiado para o atributo "titular" do objeto ao qual "minhaConta" se refere
//Ou seja, minhaConta tem uma referência ao mesmo Cliente que c se refere, podendo ser acessado via minhaConta.titular

