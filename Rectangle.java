public class Rectangle
{
	int length;
	int breadth;
public Rectangle(){

	length = 2;
	breadth = 4;
}

public Rectangle(int len, int brdth){

	length = len;
	breadth = brdth;
}
public void Area(){

	int Area = length * breadth;

	System.out.println("Area of the triangle:"+Area);
}

public static void main(String [] args){

	Rectangle r = new Rectangle(2,4);
	r.Area();
	Rectangle r1=new Rectangle(0,0);
	r1.Area();
}

}