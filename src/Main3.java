
//Program of counter by static variable



//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter2{  
static int count=0;//wi 
Counter2(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  

}  
   

public class Main3 {
	  
	public static void main(String args[]){  
	//creating objects  
	Counter2 c1=new Counter2();  
	Counter2 c2=new Counter2();  
	Counter2 c3=new Counter2();  
	}  
}


 