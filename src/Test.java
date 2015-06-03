import java.io.IOException;


public class Test {

	
	public void print(String data)
	{
		System.out.println("Data");
	}
	
	public void print(Object obj)
	{
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		Test test= new Test();
		char cha = '\u039D'; 
		System.out.println(cha);
	}
}
