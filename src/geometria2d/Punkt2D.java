//import java.util*;
package geometria2d;


public class Punkt2D {
	private int x,y;
	public Punkt2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void drukuj()
	{
		System.out.println("Para x: "+x+" y: "+y);
	}
	
	@Override public String toString()
	{
		return new String("Para x: "+x+" y: "+y);
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	

}
