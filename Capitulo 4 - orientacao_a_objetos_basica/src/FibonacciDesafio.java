class FibonacciDesafio {
	
	
int CalculaFibonacci (int n) {
		if(n == 0)
		return 0;
		
		if(n == 1)
		return 1;
		
		return CalculaFibonacci(n - 1) + CalculaFibonacci (n - 2);
		
		}
}

class Fibonacci{
	public static void main (String [] args){
		FibonacciDesafio f1 = new FibonacciDesafio ();
		
		System.out.println(f1.CalculaFibonacci(5));
		
	}
}

//Estudar sobre RECURS�O, foi utilizado um m�todo que chamou ele mesmo para resolu��o.
//Pq � mais lento o modo recursivo do que o iterativo?
//Operador condi��o tern�rio � como se fosse um if e else
//b = (a>0) ? 1 : 2  ou seja, (Express�o) ? ValorTrue : ValorFalse
