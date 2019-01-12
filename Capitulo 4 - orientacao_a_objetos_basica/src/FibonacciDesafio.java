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

//Estudar sobre RECURSÃO, foi utilizado um método que chamou ele mesmo para resolução.
//Pq é mais lento o modo recursivo do que o iterativo?
//Operador condição ternário é como se fosse um if e else
//b = (a>0) ? 1 : 2  ou seja, (Expressão) ? ValorTrue : ValorFalse
