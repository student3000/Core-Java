/*
	
comand-line argument

java DynamicArray a b c "Good Morning" "Good Afternoon" "Hello World"
a
b
c
Good Morning
Good Afternoon
Hello World
	

public class DynamicArray
{
	int array_size;
	
	public static void printIntArray(int... ary){
		for(int var : ary){
			System.out.println(var);
		}
			System.out.println("------------ END ---------");
	}
	
	public static void main(String... args){
		
		if(args.length == 0){
		
				System.out.println("Array Size must be greater than zero ");
		
		}else{
		
			if(Integer.parseInt(args[0]) <= 0 ){
			 System.exit(0);
			}
			String [] strary = new String[Integer.parseInt(args[0])];

			System.out.println("Your Array Size : " + strary.length);
		
		
		}
		
		/*
for(String var : strary){
			System.out.println(var);
		}
		
				printIntArray(15,25);
		
		printIntArray(15,25,35);
		
		printIntArray();
		*/
	}

}