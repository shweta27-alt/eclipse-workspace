package Arrays_gettingStart;

import java.util.Arrays;

public class referencetype_Vs_valuetype {
	public static void main(String[] args) {
		
		int firstInt = 9;
		int secondInt = firstInt;
		
		System.out.println("the first int value is:"+ firstInt);
		System.out.println("the second int value is:"+ secondInt);
		
		secondInt = secondInt + 1;
		
		System.out.println("the first int value is:"+ firstInt);
		System.out.println("the second int value is:"+ secondInt);
		
		int[] myfirstArray = new int[7];
		int[] mySecondArray = myfirstArray;
		
		System.out.println("the first array is "+ Arrays.toString(myfirstArray));
		System.out.println("the second array is "+ Arrays.toString(mySecondArray));
		
		mySecondArray[5]= 1;
		
		System.out.println("the updated first array is "+ Arrays.toString(myfirstArray));
		System.out.println("the updated second array is "+ Arrays.toString(mySecondArray));
		
		
		modifyArray(mySecondArray);
		
		System.out.println("the modified first array is "+ Arrays.toString(myfirstArray));
		System.out.println("the modified second array is "+ Arrays.toString(mySecondArray));
		    
		mySecondArray=new int[7];
		mySecondArray[0]=10;
		
		System.out.println("the latest first array is "+ Arrays.toString(myfirstArray));
		System.out.println("the latest second array is "+ Arrays.toString(mySecondArray));
		    
	
	}
	
	public static void modifyArray(int[] array) {
		array[2]=1;
	}

}
