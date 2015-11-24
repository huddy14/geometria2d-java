package main;
import java.util.*;
import geometria2d.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figura> kF = new ArrayList<Figura>();
		
		kF.add(new Kwadrat (new Punkt2D (0,0),3));
		kF.add(new Kwadrat(new Punkt2D(3,3),6));
		kF.add(new Prostokat(new Punkt2D(3,3),new Punkt2D(5,7)));
		kF.add(new Prostokat(new Punkt2D(0,1),new Punkt2D(5,2)));
		kF.add(new Kolo(new Punkt2D(3,1),5));
		kF.add(new Kolo(new Punkt2D(6,2),3));
		
		for(Figura i: kF)
		{
			if(i instanceof Rysowanie)
			{
				Rysowanie r = (Rysowanie) i;
				r.rysuj();
			}
			i.drukuj();
		}
	
	}

}
