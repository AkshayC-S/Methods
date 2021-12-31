class  MethodsCar{
	
	static void printStri(String []methcar){
		for(int index=0; index< methcar.length; index++){
			System.out.print(methcar[index]+"\t");
		}
	}
	
	static String[] changeVal(String[] change, int i){
		change[i]= "suzuki";
		return change;
	}


	public static void main(String []aks){
		String []car ={"Bucati","Porche","TATA","Hyundai","Mercedes"};
		printStri(car);
		System.out.println();
		String []newstr = changeVal(car,3);
		printStri(newstr);

		
	}
}