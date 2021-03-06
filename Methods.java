class Methods{
	
	static void printFact(){
		long fact=1;
		
		for(int i=1;i<=10;i++)
			fact=fact*i;
		
		System.out.println("Factorial of 10 is"+fact);
		System.out.println();
		System.out.println("/////////////////////////////////////////");
	}
	
	static void printFactSer(){
		long fact=1;
		
		for(int i=1;i<=10;i++){
			fact=fact*i;
			System.out.println("Factorial of "+ i +" is " + fact);
			System.out.println();
			System.out.println("////////////////////////////////////////");
			
		}	
	}
	
	static void printLeapYear(){
		int y = 2000;
		boolean leap = false;
		
		if(y % 4 == 0){
			if(y % 100 == 0){
				if(y % 400==0){
					leap = true;
				}
					else
						leap = false;
				
			}
				else
					leap = true;
			
		}
			else
				leap = true;
	
		if(leap){
			System.out.println(y +" is a leap year");
		}
			else{
				System.out.println(y +" is not a leap year");
			}
		
		System.out.println();
		System.out.println("/////////////////////////////////////////////////");
	}
	
	static void printFibonacci(){
		int n=10;
		int num1=0,num2=1;
		
		System.out.println("Fibonacci Numbers are");
		System.out.print(num1+"\t"+num2+"\t");
		
		for(int i=1;i<=n;i++){
			
			
			int total=num1+num2;
			num1=num2;
			num2=total;
			System.out.print(total+"\t");
		}
		
		System.out.println();
		System.out.println("//////////////////////////////////////////////////");
	}

	public static void main(String []arh){
		
		System.out.println("Printing factorial of 10");
		System.out.println();
		printFact();
		System.out.println();
		
		System.out.println("Printing factorial series upto 10");
		System.out.println();
		printFactSer();
		System.out.println();
		
		System.out.println("Checking Leap Year of 2000");
		System.out.println();
		printLeapYear();
		System.out.println();
		
		System.out.println("Printing Fibonacci series of 1st 10 digits");
		System.out.println();
		printFibonacci();
		System.out.println();
		
	}	
}