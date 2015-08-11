public class OverridingSampleExample{

	int a ;
	float b;
	String str;


	public String toString(){
		return this.a +  " : " + this.b + " : " + this.str;
	}

	public static void main(String [] args){
		
		OverridingSampleExample ob = new OverridingSampleExample();
		ob.a = 1;
		ob.b = 2.5f;
		ob.str = "object-1";
		System.out.println(ob); 
		// OverridingSampleExample@1db9742
		
		
		OverridingSampleExample ob2 = new OverridingSampleExample();
		ob2.a = 2;
		ob2.b = 2.2f;
		ob2.str = "object-2";
		System.out.println(ob2);
		
		
		
		OverridingSampleExample ob3 = new OverridingSampleExample();
		ob3.a = 3;
		ob3.b = 3.3f;
		ob3.str = "object-3";
		System.out.println(ob3);
		
		
		OverridingSampleExample ob4 = new OverridingSampleExample();
		ob4.a = 4;
		ob4.b = 4.4f;
		ob4.str = "object-4";
		System.out.println(ob4);
		
		
		/*
			output :
				1 : 2.5 : object-1
				2 : 2.2 : object-2
				3 : 3.3 : object-3
				4 : 4.4 : object-4
		
		*/
		
		
		
		
		
		
	}

}