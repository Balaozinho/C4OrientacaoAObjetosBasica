//criar uma classe para as portas exclusivamente

 
class Portas {
	
	boolean aberta;
	String porta1;
	String porta2;

	//m�todos void condicionais para o boolean aberta
	
	void abre(){
		if(this.aberta == false){
			this.aberta = true;
			System.out.println("A porta est� ABERTA");
		}
	}
	
	void fecha(){
		if(this.aberta == true){
			this.aberta = false;
			System.out.println("A porta est� FECHADA");
		}
	}

	//m�todo boolean
	
		boolean estaAberta(){
			return this.aberta;
		}
}

//classe exclusiva da casa
//atributos cor, porta1 e porta2
//m�todo pinta
//m�todo int retornando um n�mero para calculo de quantas portas obedecem a condicao booleana de estarem abertas


class Casa {
	String cor;
	Portas p1 = new Portas();
	Portas p2 = new Portas();
	
	void pinta(String cor)
	{
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas()
	{
		int abertas = 0;
		if(this.p1.estaAberta()){
			abertas += 1;
		}
		if(this.p2.estaAberta()){
			abertas += 1;
		}
		return abertas;
	}
}

class TestaCasa {
	public static void main(String []args){
		
		Casa c1 = new Casa ();
		c1.pinta("Amarela");
		c1.p1.fecha(); //chamei o m�todo da classe porta para a referencia c1, que est� no objeto Casa
		c1.p2.abre(); //chamei o m�todo da classe porta para a referencia c1, que est� no objeto Casa
		
		System.out.println("A cor da casa �:" + c1.cor);
		System.out.println("A quantidade de portas abertas �:" + c1.quantasPortasEstaoAbertas());
			
	}
}