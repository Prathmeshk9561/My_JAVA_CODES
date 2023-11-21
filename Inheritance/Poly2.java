package Inheritance;
class Shape{
	void draw(){
		System.out.println("Draw Shape Class");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw Rectangle Shape");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Draw Circle Shape");
	}

}
public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Rectangle();
		s1.draw();
		s1=new Circle();
		s1.draw();
		
	}

}
