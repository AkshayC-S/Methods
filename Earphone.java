class Earphone{
	
	static void printStr(String metherphonebrand[]){
		for(int index=0; index<metherphonebrand.length; index++){
			System.out.print(metherphonebrand[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String erphonebrand[]={"onepluse","samsung","redmi","realme","boat"};
		printStr(erphonebrand);
		erphonebrand[1]= "Noise";
		System.out.println();
		printStr(erphonebrand);
	}
}