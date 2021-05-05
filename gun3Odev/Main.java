package gun3Odev;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Ozan");
        student.setLastName("Yiðit");
        student.setEmail("ozanyigit@gmail.com");
        student.setPassword("cabbar33");
        student.setUserName("ozanyigt");
        
        Instructor instructor = new Instructor();
        instructor.setName("Engin ");
        instructor.setLastName("Demiroð");
        instructor.setEmail("12345");
        instructor.setBranch("Java");
        
        System.out.println(student.getName());
        System.out.println(instructor.getName());
	     
	    InstructorManager instrucktor = new InstructorManager();
	    instrucktor.add(instructor);
	}

}
