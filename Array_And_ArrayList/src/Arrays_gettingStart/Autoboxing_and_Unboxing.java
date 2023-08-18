package Arrays_gettingStart;
import java.util.*;

public class Autoboxing_and_Unboxing {
	public static void main(String[] args) {
		
		//Integer
		//autotboxing
		ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			myIntArrayList.add(Integer.valueOf(i));
		}
		
		
		//unboxing
		for(int i=0;i<=10;i++) {
			System.out.println(i+" is "+ myIntArrayList.get(i).intValue());
		}
		
		
		//Double
		//autoboxing
		ArrayList<Double> myDoubleList = new ArrayList<Double>();
		for(Double i=0.0;i<=10.0;i+=0.5) {
			myDoubleList.add(Double.valueOf(i));
		}
		
		
		//unboxing
		for(int i=0;i<myDoubleList.size();i++) {
			System.out.println(myDoubleList.get(i).doubleValue());
		}
	}

}





