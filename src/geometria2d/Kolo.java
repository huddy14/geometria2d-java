package geometria2d;

public class Kolo extends Figura{
	
	private double r;
	private Punkt2D p;
	
	public Kolo(Punkt2D p, int r)
	{
		this.p = p;
		this.r = r;
	}
	public double obwod()
	{
		return new Double(2*Math.PI*r);
	}
	
	public double pole()
	{
		return new Double(Math.PI*Math.pow(r, 2));
	}
	
	public void drukuj()
	{
		System.out.println("Koło o środku: "+p.toString()+" i promieniu: "+r);
	}

}
