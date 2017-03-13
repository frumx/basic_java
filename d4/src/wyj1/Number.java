package wyj1;

public class Number {
static double divide(double a, double b) throws DivideZeroException{
	if(b==0) throw new DivideZeroException("aaaa");
	else return a/b;
}
}
