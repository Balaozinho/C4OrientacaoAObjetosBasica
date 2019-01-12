class Porta1 {
	
boolean aberta;
String cor;
double dimensaoX;
double dimensaoY;
double dimensaoZ;


void abre(){
	
	if(aberta == false)
	{
		aberta = true;
		System.out.println("A PORTA FOI ABERTA");
	}

}

void fecha(){
	if(aberta == true)
	{
		aberta = false;
		System.out.println("A PORTA FOI FECHADA");
	}
}

void pinta(String cor)
{
	this.cor = cor;
}

void estaAberta(){
	if (aberta == true){
		System.out.println("A PORTA ESTA ABERTA");
	}
	else {
		 System.out.println("A PORTA ESTÁ FECHADA");
	}
}

}

class TestePorta{
	public static void main(String [] args) {
		
		Porta1 p1 = new Porta1();
		
		p1.dimensaoX = 10;
		p1.dimensaoY = 20;
		p1.dimensaoZ = 30;
		
		p1.pinta("azul");
		p1.abre();//Abri a porta
		p1.fecha(); //Fechei a porta
		p1.estaAberta(); //Conferir se porta esta aberta ou fechada
		
		System.out.println("Sua cor é " + p1.cor + " e suas dimensões XYZ:" + p1.dimensaoX + "/" + p1.dimensaoY + "/" + p1.dimensaoZ);
		
	}
		
}
