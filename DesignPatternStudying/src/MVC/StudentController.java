package MVC;

public class StudentController {
	
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentRollNo() {
		return model.getRollNo();
	}
	
	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	
	public static void main(String[] args) {
		Student jiwon = new Student();
		jiwon.setName("Jiwon");
		jiwon.setRollNo("040991933");
		
		StudentView view = new StudentView();
		StudentController student = new StudentController(jiwon, view);
		student.updateView();
	}

}
 