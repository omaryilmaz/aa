//Java Program to demonstrate the use of static variable  


public class Main {
	public static void main(String args[]){  
		Student s1 = new Student(2000,"Muhammed");  
		Student s2 = new Student(4000,"Essa");  
		//we can change the college of all objects by the single line of code  
		Student.college="Basra";  
		s1.salary = 900;
		s1.display();  
		s2.display();  
		}  
}


 