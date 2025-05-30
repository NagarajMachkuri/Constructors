public class Circle{
	double radius;
public Circle(double radius){
	this.radius=radius;
		
}

public void getArea(){

	System.out.println((22/7)*radius*radius);
}
public void getCircumfrence(){

System.out.println(2*(22/7)*radius);

}

public static void main(String [] args){

Circle cic = new Circle(5.0);
cic.getArea();
cic.getCircumfrence();
}
	
}
