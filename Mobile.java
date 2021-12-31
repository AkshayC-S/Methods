class Mobile{
	
	static void printStr(String methphone[]){
		for(int index=0; index<methphone.length; index++){
			System.out.print(methphone[index]+"\t");
		}
		
	}	
	
	public static void main(String []aks){
		String phone[]={"Samsung","i phone","onepluse","redmi","realme"};
		printStr(phone);
		phone[3]= "Mi";
		System.out.println();
		printStr(phone);
	}
}