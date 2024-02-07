package oops;
class Students{
	int id;
	int age;
	Students(){
		System.out.println(age+","+id);
	}
	Students(int id,int age){//parameters consturators
		this.age=age;
		this.id=id;
		System.out.println(age+","+id);
		
		
				
	}
}
public class Constructors {
public static void main(String[] args) {
	Students std1 = new Students(01,24);
	Students std2 = new Students();
}
}
