package Wall;

public class wall {
	private double width;
	private double height;
	
	public wall() 
    {
    	
    }

	public wall(double width, double height) {
		if(width < 0)
		{
			width=0;
		}
		
		if(height< 0) {
			height=0;
		}
		
		this.width = width;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getwidth() {
		return width;
	}
	
	public void setwidth(double width) {
		if(width < 0) {
			width=0;
		}
		this.width=width;
	}
	
	public void setheight(double height) {
		if(height < 0) {
			height=0;
		}
		this.height=height;
	}
	
	public double getArea() {
		return getwidth() * getHeight();
	}
	
	public static void main(String[] args) {
		wall wall = new wall(5,4);
		System.out.println("area="+ wall.getArea());
		
		wall.setheight(-1.5);
		System.out.println("width=" + wall.getwidth());
		System.out.println("height=" + wall.getHeight());
		System.out.println("area=" + wall.getArea());
	}
}






















   
 