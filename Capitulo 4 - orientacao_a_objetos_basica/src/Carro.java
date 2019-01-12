class Carro {
	
	int numero;
	String cor;
	String modelo;
	double VelocidadeAtual;
	double VelocidadeMaxima;
	
	
	//liga o carro
	void liga() {
		System.out.println("O carro está ligado");
	}
	
	//acelera certa quantidade
	void acelera (double quantidade){
		double VelocidadeNova = this.VelocidadeAtual + quantidade;
		this.VelocidadeAtual = VelocidadeNova;
	}
	
	int pegaMarcha () {
		
		if(this.VelocidadeAtual < 0){
			return -1;
		}
		if(this.VelocidadeAtual > 0 && this.VelocidadeAtual < 40){
			return 1;
		}
		if(this.VelocidadeAtual >= 40 && this.VelocidadeAtual < 80){
			return 2;
		}
		return 3;
	}	
}

class TestaCarro {
	public static void main (String [] args){
		Carro MeuCarro;
		MeuCarro = new Carro ();
		MeuCarro.cor = "Verde";
		MeuCarro.modelo = "Fuscao";
		MeuCarro.VelocidadeAtual = 40;
		MeuCarro.VelocidadeMaxima = 80;
		
		//liga o carro
		MeuCarro.liga ();
		
		//acelera o carro
		MeuCarro.acelera(20);
		
		System.out.println(MeuCarro.VelocidadeAtual);
	}
}

