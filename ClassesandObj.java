package oops;
import java.util.*;
public class ClassesandObj {
	// instance variable 
	String name;
	int id;
	char grade;
	public void printdetails() {
		System.out.println(name+","+id+","+grade);
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ClassesandObj obj = new  ClassesandObj();//normal case
	System.out.print("enter no of students ");
	int k=sc.nextInt();
	ClassesandObj std[] = new  ClassesandObj[k];//array case
	for (int i=0; i<k;i++) {
		std[i]=new ClassesandObj();
		System.out.println("enter the student"+i+1+" details");
		System.out.print("Name: ");
        std[i].name = sc.next();
        System.out.print("ID: ");
        std[i].id = sc.nextInt();
        System.out.print("Grade: ");
        std[i].grade = sc.next().charAt(0);
		
		
	}
	 for (int i = 0; i < k; i++) {
         std[i].printdetails();
     }
	sc.close();
	
}
}
