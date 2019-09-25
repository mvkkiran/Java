package sample;

public class DrawDemo {
	public static void main(String args[])
	{
		DrawObject d=new DrawObject();
		d.Draw();
		
		Line l=new Line();
		l.Draw();
		
		Circle c=new Circle();
		c.Draw();
		
		Square s=new Square();
		s.Draw();
		
		DrawObject a=new Line();
		a.Draw();
		
		DrawObject z=new Circle();
		z.Draw();
		
	
		
	}

}
