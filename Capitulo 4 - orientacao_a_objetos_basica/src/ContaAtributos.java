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

//Caso adicionado algo nas vari�veis de atributo, o sistema adotar� como valor de default
//Neste caso, ao criar uma conta, as vari�veis j� estar�o "populadas"
	
}

class Teste {
	public static void main (String [] args) {
		ContaAtributos minhaConta = new ContaAtributos ();
		Cliente c = new Cliente ();
		minhaConta.titular = c;
	}
}
//O valor da var�avel "c" foi copiado para o atributo "titular" do objeto ao qual "minhaConta" se refere
//Ou seja, minhaConta tem uma refer�ncia ao mesmo Cliente que c se refere, podendo ser acessado via minhaConta.titular

