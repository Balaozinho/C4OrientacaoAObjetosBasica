class Conta2 {
	
	double salario; 
	int numero;
	String dono; //string � uma classe em java
	double saldo;
	double limite;
	
	//declarados os atributos que as contas devem ter, declaradas fora de um bloco <> main
	//Qdo declara��o da vari�vel � dentro do escopo de uma classe, a vari�vel � conhecida como vari�vel de objeto ou atributo
	
	//m�todo void n�o retorna nenhuma informa��o
	//Neste caso, o m�todo ir� retornar uma condi��o booleana
	//Tradu��o: m�todo envolve a retirada de uma quantidade X do saldo, se o saldo for menor que esta quantidade, a condi��o booleana retornar� falso
	//Caso a quantidade indicada for menor que o atributo saldo (indicado pelo this), realizar� o devido c�lculo e retornar� um valor verdadeiro
	
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

class TestaAlgunsMetodos2 {
	public static void main (String [] args){
		
		//criando conta
		Conta2 minhaConta;//Al�m disso, o objeto criado dever� ser acessado, por isso iremos criar uma vari�vel para referencia
		minhaConta = new Conta2 ();//Para criar ou instanciar uma conta, basta utilizar o new
		
		//altera valor de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 200.0;
		//o "ponto" � utilizado para acessar algo em minhaConta, a minhaConta pertence ao Duke e seu saldo � de mil reais
		
		boolean consegui = minhaConta.retirada(100); 
		
		//cria��o de uma vari�vel tempor�ria "consegui"
		//acessei o m�todo retirada aqui e indiquei a quantidade, que ser� comparada com o atributo de saldo, se a condi��o booleana do m�todo retornar VERDADEIRO
		
		if (consegui){
			System.out.println("Consegui sacar");
		}
		else{
			System.out.println("N�o consegui sacar");
		}
		
	}
}

