package app1;
 class Teacher{
	 String designation="Teacher";
		String college="Beinner";
		
		void dose(){
			System.out.println("Teacher");
		}
 }
public class Inharitance extends Teacher{
	 String mainSubject = "Maths";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inharitance obj = new Inharitance();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      obj.dose();
	}

}
