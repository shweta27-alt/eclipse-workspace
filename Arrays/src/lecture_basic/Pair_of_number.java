package lecture_basic;

public class Pair_of_number {
	public static void main(String[] args) {
		int[] num = {2,4,7,9,10,12,14};
		pairs(num);
	}
    
    public static void pairs(int[] num) {
    	int tp=0;
    	for(int i=0;i<num.length;i++) {
    		int current=num[i];
    		for(int j=i+1;j<num.length;j++) {
    			System.out.print("("+current+","+num[j]+")");
    			tp++;
    		}
    		System.out.println();
    	}
    	System.out.println(tp);
    }
}

/*
(2,4)(2,7)(2,9)(2,10)(2,12)(2,14)
(4,7)(4,9)(4,10)(4,12)(4,14)
(7,9)(7,10)(7,12)(7,14)
(9,10)(9,12)(9,14)
(10,12)(10,14)
(12,14)
*/