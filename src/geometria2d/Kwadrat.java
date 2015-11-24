package geometria2d;

public class Kwadrat extends Figura implements Rysowanie{

	private Punkt2D p1; 
	
	private int a;
	
	public Kwadrat(Punkt2D p1, int a)
	{
		this.p1 = p1;
		
		this.a = a;
	}
	
	public double pole()
	{
		
		return a*a;
	}
	
	public double obwod()
	{
		return 4*a;
	}
	public void rysuj()
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void drukuj()
	{
		System.out.println("Kwadrat o boku: "+a+" o dolnym boku w punkcie: "+p1.toString());
	}
	//public double getLength()
	//{
	//	return new Double(Math.sqrt((p1.getX()-p2.getX())^2+(p1.getY()-p2.getY())^2));
	//}
}
