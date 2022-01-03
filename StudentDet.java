class StudentDet{
		static String [] studentname={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
		
		static void addName(int index, String name){
			studentname[index] = name;			
		}
		
		static void printAll(){
				for(int num=0; num<studentname.length; num++){
					System.out.println(studentname[num]);
				}	
		}
}