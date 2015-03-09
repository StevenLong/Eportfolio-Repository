public class Circle
{
	//Member variables
	private double radius;

	//Member methods
	//Constructors
	public Circle()
	{
		radius = 0;
	}

	public Circle(double r)
	{
		radius = r;
	}

	//
	public void setCircle(double r)
	{
		radius = r;
	}

	public double area()
	{
		double a = Math.PI*radius*radius;
		return a;
	}

	public double perimeter()
	{
		double p = 2*Math.PI*radius;
		return p;
	}

	public String toString()
	{
		return ("radius is " + radius /*+ "\narea is " + a + "\ncircumference is " + p*/);
	}
}




