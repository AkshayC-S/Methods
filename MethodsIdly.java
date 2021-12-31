class MethodsIdly{
	
	
	static void printArry(String menu1[]){
			for(int index=0;index<menu1.length;index++){
				System.out.print(menu1[index]+"\t");
			}
	}
	
	public static void main(String []aks){
	
		String menu[] = {"1kiiuc","2liihyiu","3kugi","4iut","5jhtry","6hte"};
		printArry(menu);
		menu[2]= "idly vada";
		System.out.println();
		printArry(menu);
	}
}