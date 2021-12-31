class Cloths{
	
	static void printStr(String methshirtbrand[]){
		for(int index=0; index<methshirtbrand.length; index++){
			System.out.print(methshirtbrand[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String shirtbrand[]={"Allesolly","Peter England","Woodland","H&M","Hilander"};
		printStr(shirtbrand);
		shirtbrand[2]= "Roadster";
		System.out.println();
		printStr(shirtbrand);
	}
}