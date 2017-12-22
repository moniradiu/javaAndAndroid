package app1;

public class Constructor {
	
	//Field(or instance variable)
	
	String webName;
	int webAge;
	
	//constructor
	Constructor(String name,int age){
		this.webName = name;
		this.webAge = age;
	}
	
	public static void main(String[] args) {
		/*always constructor and class name same here rules of the constructor declecr and no retunr type value*/
	
		//Creating Object.
		
		Constructor obj1= new Constructor("Recipes",50);
		Constructor obj2= new Constructor("Google",500);
		
		//Accessing object data through reference
		 System.out.println(obj1.webName+" "+ obj1.webAge);
		 System.out.println(obj2.webName+" "+ obj2.webAge);

	}

}
