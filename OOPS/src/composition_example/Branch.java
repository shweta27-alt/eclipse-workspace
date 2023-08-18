package composition_example;

public class Branch {
	private String Name;
	private Session Session;
	public Branch(String name, composition_example.Session session) {
		Name = name;
		Session = session;
	}
	public String getName() {
		return Name;
	}
	public Session getSession() {
		return Session;
	}
	
}
