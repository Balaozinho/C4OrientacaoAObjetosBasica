class ContaTrans {
	
	double salario; 
	int numero;
	String dono; //string é uma classe em java
	double saldo;
	double limite;
	
	//declarados os atributos que as contas devem ter, declaradas fora de um bloco <> main
	//Qdo declaração da variável é dentro do escopo de uma classe, a variável é conhecida como variável de objeto ou atributo
	
	//método void não retorna nenhuma informação
	
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	//Perceba que este método não possui limitação no saca, podendo ser maior que o saldo
	//basicamente o código diz que uma qtdade X será retirada do atributo da conta (saldo), dando origem a um novo saldo
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	void transfere(ContaTrans ContaDestino, double valor){
		this.saldo = this.saldo - valor;
		ContaDestino.saldo = ContaDestino.saldo + valor;
	}
}

	//Método da operação de depositar Y quantidade em um determinado saldo
	//o "+=" é a soma da quantidade com o antigo valor do saldo


class Metodos7 {
	public static void main (String [] args){
		
		//criando conta
		ContaTrans minhaConta;//Além disso, o objeto criado deverá ser acessado, por isso iremos criar uma variável para referencia
		minhaConta = new ContaTrans ();//Para criar ou instanciar uma conta, basta utilizar o new
		
		//objetos são acessados por referencias, é por isso que damos new depois de declarada a variavel minhaConta
		//Ao criar uma variável para associar ao objeto, ela não o guarda! E sim uma maneira de acessá-lo, chamado referência
		//Este foi o caso da Conta minhaConta. (minhaConta não é um objeto, e sim uma maneira de acessar o objeto Conta)
		
		//altera valor de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		//o "ponto" é utilizado para acessar algo em minhaConta (por exemplo, os atributos da classe Conta criados antes do bloco main), a minhaConta pertence ao Duke e seu saldo é de mil reais
		//direciona a posição da memória em que a minhaConta se encontra	
		
		ContaTrans ContaDestino;
		ContaDestino = new ContaTrans ();
		
		ContaDestino.dono = "Álvaro";
		ContaDestino.saldo = 1000.0;
		
		minhaConta.transfere(ContaDestino, 200);
		
		
		
		System.out.println("O Saldo da conta que transeferiu é: " + minhaConta.saldo);
		System.out.println("O saldo da conta que recebeu a transferência é: " + ContaDestino.saldo);
	}
}

