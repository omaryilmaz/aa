//Java static method
//If you apply static keyword with any method, it is known as static method.
//
//A static method belongs to the class rather 
//than the object of a class.

//A static method can be invoked without 
//the need for creating an instance of a class.

//A static method can access static data member 
//and can change the value of it.


// then back to slide power point
   
 //Java Program to demonstrate the use of a static method.  
class Student1{  
     int rollno;  
     String name;  
     static String college = "Kirkuk";  
     //static method to change the value of static variable  
     static void change(){  
     college = "Mosul";  
     }  
     //constructor to initialize the variable  
     Student1(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}    

public class Main4staticMethod {
	  
	  public static void main(String args[]){  
		    Student1.change();//calling change method  
		    
		    //creating objects  
		    Student1 s1 = new Student1(1000,"Muhammed");  
		    Student1 s2 = new Student1(2000,"Essa");  
		    Student1 s3 = new Student1(3000,"Hameed");  
		    //calling display method  
		    s1.display();  
		    s2.display();  
		    s3.display();  
		    }  
}


 