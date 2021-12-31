class Bike{
	
	static void printStr(String methbrand[]){
		for(int index=0; index<methbrand.length; index++){
			System.out.print(methbrand[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String brand[]={"Royal Enfield","Yamaha","KTM","Hero Honda","TVS","Baja","Ather"};
		printStr(brand);
		brand[3]= "Hero Motocop";
		System.out.println();
		printStr(brand);
	}
}