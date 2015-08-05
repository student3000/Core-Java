public class Demo1{

	int a = 5;
	static String myname = "Good Morning";
	
	public static void printHelloWorld(){
		System.out.println("Hello World!");
		
	}
	
	public static void main(String [] args){
		System.out.println("In Main");
		printHelloWorld();
		System.out.println("String Message : " + myname);
		
		Demo2 objectName = new Demo2();
		
		objectName.demo2Method();
		
	}
	
}

class Demo2{
	int b;
	void demo2Method(){
				System.out.println("Demo2 class ");
	}

}

/*class ClassName{
	// member data - declaration of variables
	// member methods - list of methods
}

steps to compile program and run...

javac java-file-name with .java extension
java public-class-name without .class extension


*/

