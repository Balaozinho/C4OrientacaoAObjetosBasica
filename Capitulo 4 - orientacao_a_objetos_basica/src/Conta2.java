class Conta2 {
	
	double salario; 
	int numero;
	String dono; //string é uma classe em java
	double saldo;
	double limite;
	
	//declarados os atributos que as contas devem ter, declaradas fora de um bloco <> main
	//Qdo declaração da variável é dentro do escopo de uma classe, a variável é conhecida como variável de objeto ou atributo
	
	//método void não retorna nenhuma informação
	//Neste caso, o método irá retornar uma condição booleana
	//Tradução: método envolve a retirada de uma quantidade X do saldo, se o saldo for menor que esta quantidade, a condição booleana retornará falso
	//Caso a quantidade indicada for menor que o atributo saldo (indicado pelo this), realizará o devido cálculo e retornará um valor verdadeiro
	
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
		Conta2 minhaConta;//Além disso, o objeto criado deverá ser acessado, por isso iremos criar uma variável para referencia
		minhaConta = new Conta2 ();//Para criar ou instanciar uma conta, basta utilizar o new
		
		//altera valor de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 200.0;
		//o "ponto" é utilizado para acessar algo em minhaConta, a minhaConta pertence ao Duke e seu saldo é de mil reais
		
		boolean consegui = minhaConta.retirada(100); 
		
		//criação de uma variável temporária "consegui"
		//acessei o método retirada aqui e indiquei a quantidade, que será comparada com o atributo de saldo, se a condição booleana do método retornar VERDADEIRO
		
		if (consegui){
			System.out.println("Consegui sacar");
		}
		else{
			System.out.println("Não consegui sacar");
		}
		
	}
}

