package composition_example;

public class Session {
	private String SessionName;
	private Student student;
	
	public Session(String sessionName, Student student) {
		SessionName = sessionName;
		this.student = student;
	}

	public String getSessionName() {
		return SessionName;
	}

	public Student getStudent() {
		return student;
	}

	
}
