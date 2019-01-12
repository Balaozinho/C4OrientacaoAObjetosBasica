
//criar classe para portas
//métodos para abri e fechá-las
//método boolean para verificar as portas abertas


class MasterHousePortas {
	
	boolean aberta;
	String porta1;
	String porta2;
	String porta3;
	
	void abre1(){ 
		if(this.aberta == false){
			this.aberta = true;
			System.out.println("A porta1 esta ABERTA");
		}
	}
	
	void fecha1(){
		if(this.aberta == true){
			this.aberta = false;
			System.out.println("A porta1 está FECHADA");
		}
	}
	
	void abre2(){
		if(this.aberta == false){
			this.aberta = true;
			System.out.println("A porta2 está ABERTA");
		}
	}
	
	void fecha2(){
		if(this.aberta == true){
			this.aberta =  false;
			System.out.println("A porta2 está FECHADA");
		}
	}
	
	void abre3(){
		if(this.aberta == false){
			this.aberta = true;
			System.out.println("A porta3 está ABERTA");
		}
	}
	
	void fecha3(){
		if(this.aberta == true){
			this.aberta =  false;
			System.out.println("A porta3 está FECHADA");
		}
	}

	boolean estaAberta(){
	return this.aberta;
		}
}

//criar classe Casa com strings de cor, para cada porta
//criar objetos p1,p2,p3 
//métodos pinta
//int para contagem de quantas portas estão abertas


class MasterHouse{
	
	String cor1;
	String cor2;
	String cor3;
	
	MasterHousePortas p1 = new MasterHousePortas();
	MasterHousePortas p2 = new MasterHousePortas();
	MasterHousePortas p3 = new MasterHousePortas();
	
	void pinta1(String cor1){
		this.cor1 = cor1;
	}
	
	void pinta2(String cor2){
		this.cor2 = cor2;
	}
	
	void pinta3(String cor3){
		this.cor3 = cor3;
	}

	int QuantidadePortasAbertas(){
		int abertas = 0;
		
		if(this.p1.estaAberta()){
			abertas += 1;
		}
		
		if(this.p2.estaAberta()){
			abertas += 1;
		}
		
		if(this.p1.estaAberta()){
			abertas += 1;
		}
		
	return abertas;
	}
	
}

//criar classe main e declarar os métodos para as respectivas portas
//definir cores para cada uma
//imprimir


class TestaMasterHouse{
	
	public static void main(String [] args){
		
		MasterHouse c1 = new MasterHouse();
		
		c1.p1.abre1();
		c1.p2.fecha2();
		c1.p3.abre3();
		
		c1.pinta1("Azul");
		c1.pinta2("Verde");
		c1.pinta3("Amarelo");
		
		System.out.println("A cor da porta 1 é:" + c1.cor1);
		System.out.println("A cor da porta 2 é:" + c1.cor2);
		System.out.println("A cor da porta 3 é:" + c1.cor3);
		
		System.out.println("A quantidade de portas abertas é:" + c1.QuantidadePortasAbertas());
		
	}
	
}