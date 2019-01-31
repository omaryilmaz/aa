class Student{  
	 int salary;//instance variable  
	 String name;  
	 static String college ="Kirkuk";//static variable  
	 //constructor  
	 Student(int r, String n){  
		 salary = r;  
	 name = n;  
	 }  
	 //method to display the values  
	 void display (){
		 System.out.println(salary+" "+name+" "+college);
		 }  
	}  
