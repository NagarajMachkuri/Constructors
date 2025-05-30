public class Book{

	String title;
	String author;

public Book(String title1, String author1){
	title = title1;
	author = author1;
}
public void display(String Title ,String Author){

	System.out.println("title :"+title+"\n author:"+author);
}
public static void main(String [] args){

	Book b = new Book("maths","Rajendher");
	b.display("maths","Rajendher");
}


}