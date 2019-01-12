class Conta {
	
	double salario; 
	int numero;
	String dono; //string � uma classe em java
	double saldo;
	double limite;
	
	//declarados os atributos que as contas devem ter, declaradas fora de um bloco <> main
	//Qdo declara��o da vari�vel � dentro do escopo de uma classe, a vari�vel � conhecida como vari�vel de objeto ou atributo
	
	//m�todo void n�o retorna nenhuma informa��o
	
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	//Perceba que este m�todo n�o possui limita��o no saca, podendo ser maior que o saldo
	//basicamente o c�digo diz que uma qtdade X ser� retirada do atributo da conta (saldo), dando origem a um novo saldo
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
}
	//M�todo da opera��o de depositar Y quantidade em um determinado saldo
	//o "+=" � a soma da quantidade com o antigo valor do saldo


class TestaAlgunsMetodos {
	public static void main (String [] args){
		
		//criando conta
		Conta minhaConta;//Al�m disso, o objeto criado dever� ser acessado, por isso iremos criar uma vari�vel para referencia
		minhaConta = new Conta ();//Para criar ou instanciar uma conta, basta utilizar o new
		
		//objetos s�o acessados por referencias, � por isso que damos new depois de declarada a variavel minhaConta
		//Ao criar uma vari�vel para associar ao objeto, ela n�o o guarda! E sim uma maneira de acess�-lo, chamado refer�ncia
		//Este foi o caso da Conta minhaConta. (minhaConta n�o � um objeto, e sim uma maneira de acessar o objeto Conta)
		
		
		//altera valor de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		//o "ponto" � utilizado para acessar algo em minhaConta (por exemplo, os atributos da classe Conta criados antes do bloco main), a minhaConta pertence ao Duke e seu saldo � de mil reais
		//direciona a posi��o da mem�ria em que a minhaConta se encontra
		
		
				
		//saca 200 reais
		minhaConta.saca(200); //Para mandar msg ao objeto e pedir a execu��o do m�todo, tamb�m � utilizado o ponto (invoca��o do met�do)
		
		minhaConta.deposita(500);
		
		System.out.println("Saldo atual �: " + minhaConta.saldo);
	}
}
