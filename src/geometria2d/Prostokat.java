package geometria2d;

public class Prostokat extends Figura implements Rysowanie{
	private Punkt2D p1; 
	private Punkt2D p2; 
	
	private int x,y;
	public Prostokat(Punkt2D p1, Punkt2D p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.x = Math.abs(p1.getX()-p2.getX());
		this.y = Math.abs(p2.getY()-p1.getY());
		
	}
	
	public double pole()
	{
		
		return x*y;
	}
	
	public double obwod()
	{
		return 2*x+2*y;
	}
	public void rysuj()
	{
		for(int i=0;i<y;i++)
		{
			for(int j=0;j<x;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void drukuj()
	{
		System.out.println("Prostokat o bokach dlugosci x: "+x+" y: "+y+" w punktach: " +p1.toString()+" oraz "+p2.toString());
	}
	

}
