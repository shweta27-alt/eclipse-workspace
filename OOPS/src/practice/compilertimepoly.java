package practice;

public class compilertimepoly {
	
 int sum(int a,int b) {
	 return a+b;
 }
 
 int sum(int a, int b, int c) {
	 return a+b+c;
 }
 
 public static void main(String[] args) {
	 compilertimepoly s1 = new compilertimepoly();
	 System.out.println(s1.sum(3,5));
	 System.out.println(s1.sum(3,5,6));
 }


}
