package InnerClass;

import InnerClass.Quad.Disc;

public class Main {
	public static void main(String[] args) {
		Quad qc = new Quad(2,20,6,20.1);
		
		Quad.Disc dc = qc.new Disc();
		dc.display();
		
//		**Syntax**
//		OuterClass outerobj = new OuterClass();
//		OuterClass.InnerClass innerClass = outerObj.new InnerClass();
	}

}
