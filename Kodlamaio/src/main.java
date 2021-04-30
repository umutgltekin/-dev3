
public class main {

	public static void main(String[] args) {
		Instructormanager a=new Instructormanager();
		Instructor umut=new Instructor();
		Student yunus=new Student();
		umut.id=12222;
		umut.lastname="gültekþn";
		a.add(umut);
		a.lessonadd("mat");
		

	}
	}
 class Usermanager {	
		public void add(User manager) {
			System.out.println(manager.id+" "+manager.lastname+" "+manager.name);
}
	}
 class Instructormanager extends Usermanager{
	 @Override
	 public void add(User manager) {
		 System.out.println("eðitmen eklendi");
		 
	 }
		public void lessonadd(String lesson) {
			System.out.println(lesson);
		}
		public void quizadd(String quiz) {
			System.out.println(quiz);
		}
	}
 class Studentmanager{
		public void lessongo(String lesson) {
			System.out.println(lesson);
		}
		public void enterquiz(String quiz) {
			System.out.println(quiz);
		}
		}



