package demo;

public class Cellphone {
	private int Ram;
	private int NoOfCameras;
	private String model;
	private String Colour;
	private String processor;
	
	public void setModel(String model) {
		String ValidModel = model.toLowerCase();
		if(ValidModel.equals("node") || ValidModel.equals("7pro")){
			this.model= model;
		}else {
			this.model= "Unknown";
		}
	}
	public String getModel() {
		return this.model;
	}

}
