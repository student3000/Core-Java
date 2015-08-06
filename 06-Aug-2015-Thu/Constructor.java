package construct;

public class Constructor{

	int var ;
	
	int[] ary;
	
	{
		System.out.println(" initialization block -1 ");
	}
	
	{
		System.out.println(" initialization block -2 ");
	}
	
	static
	{
		System.out.println(" static block ");
	}
	
	
	// default - Constructor ( explicit )
	public Constructor(){
		System.out.println(" without Argument Cosnt ");
		// default constructor...
	}
	
	// parameterized - Constructor ( explicit )
	public Constructor(int x){
		
		ary = new int[x];
		
		System.out.println(" 1- Argument Cosnt : " + x);
		// default constructor...
	}
	public void print(){}
	public static void main(String... str){
		
		//new Constructor(6);
		
		//new Constructor(11);
		
		//new Constructor(14);
		
		//new Constructor();
		
	}


}