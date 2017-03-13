package Zad1_Wyjatki;

public class Number {

	public static double divide(double a, double b) throws DivideByZeroException{
		if(b==0) throw new DivideByZeroException("Nie mozna dzielic przez 0");
		else return a/b;		
	}
}
