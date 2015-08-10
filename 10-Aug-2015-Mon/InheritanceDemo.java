class Demo{

	public String toString(){
		return "Demo-ToString Method";
	}

}

public class InheritanceDemo{
	
	static String refVar = new String("String-1"); 
	
	static Demo obj = new Demo();

	public static void main(String... s){
		System.out.println("Hello Inheritance Demo Class");
		System.out.println(refVar.toString());
		System.out.println(obj); //Demo@1db9742
	}
	
}

/*
	out-put
		
	Hello Inheritance Demo Class
	String-1
	Demo-ToString Method	

*/