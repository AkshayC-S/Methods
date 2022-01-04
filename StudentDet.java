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
		
		static void updateName(String oldname, String newname){
			for(int index=0;index<studentname.length;index++){
				if(oldname.equals(studentname[index])){
					studentname[index]=newname;
                }
			}	
		}
}