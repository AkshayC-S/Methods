class Laptop{
	
	static void printStr(String methpc[]){
		for(int index=0; index<methpc.length; index++){
			System.out.print(methpc[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String pc[]={"Lenevo","Asus","HP","Acer","MSI"};
		printStr(pc);
		pc[4]= "Redmi";
		System.out.println();
		printStr(pc);
	}
}