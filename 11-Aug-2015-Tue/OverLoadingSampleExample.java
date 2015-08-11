public class OverLoadingSampleExample{

	void print(){
		System.out.println("void print");
	}

	void print(int a){
		System.out.println("int print");
	}

	void print(float f){
		System.out.println("float print");
	}	
	
	
	public static void main(String... s){
			
		OverLoadingSampleExample object = new OverLoadingSampleExample();
		object.print();
		object.print(1);
		object.print(1.3f);
		
	}
	
}