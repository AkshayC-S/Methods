class WaterFalls{
	
	static void printStr(String methfalls[]){
		for(int index=0; index<methfalls.length; index++){
			System.out.print(methfalls[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String falls[]={"Joge falls","Hebbe falls","dabdabe falls","Kallathigiri Falls","Shanti Falls"};
		printStr(falls);
		falls[2]= "Jari Falls";
		System.out.println();
		printStr(falls);
	}
}