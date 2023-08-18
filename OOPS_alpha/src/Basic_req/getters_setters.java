package Basic_req;
//encap is covered
public class getters_setters {
	public static void main(String[] args) {
		pen p1 = new pen();
		p1.setcolor("Blue");
		System.out.println(p1.getcolor());
		
		p1.settip(5);
		System.out.println(p1.gettip());
	}
	
}

class pen{
	private String color;
	private int tip;
	
	void setcolor(String color) {
		this.color=color;
	}
	
	void settip(int tip) {
		this.tip=tip;
	}
	
	
	String getcolor() {
		return this.color;
	}
	
	int gettip() {
		return this.tip;
	}
}

