//----------------------- Interface -------------------
// ------- same-same extends, otherwise implements
// class-class extends
// class-interface implements


interface Sample1{
	void print();
}

interface Sample2{
	void print();
	void method1();
}

interface Sample3 extends Sample1,Sample2{
	void print();
	void method1();

}


public class InterfaceDemo implements Sample3{

	public void print(){
	
	}
	public void method1(){
	}

	public void classSpecificMethod(){
		
	}
}
