class Karnataka{
	
	static void printStr(String methdistrict[]){
		for(int index=0; index<methdistrict.length; index++){
			System.out.print(methdistrict[index]+" \t");
		}
		
	}	
	
	public static void main(String []aks){
		String district[]={"Banglore","Belgaum","Bellary","Bijapur","Chikmagalur","Gulbarga"};
		printStr(district);
		district[0]= "Bengaluru";
		district[1]= "Belagvi";
		district[2]= "Ballari";
		district[3]= "Vijapura";
		district[4]= "Chikkamagaluru";
		district[5]= "Kalaburgi";
		System.out.println();
		printStr(district);
	}
}